package by.naxa.learning.upworktest.web

import org.springframework.core.io.ClassPathResource
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import java.io.IOException
import javax.servlet.ServletContext
import javax.servlet.http.HttpServletResponse


/**
 * Which of the following code samples will correctly return an image in @ResponseBody from a byte[] of image data?
 */
@Controller
@RequestMapping("/photo")
class ImageController (
        val context: ServletContext
) {

    @RequestMapping("/v1")
    @Throws(IOException::class)
    fun testPhoto() : ResponseEntity<ByteArray> {
        // I don't know where to place static resources in Spring Boot JAR in a way so they are accessible via ServletContext (WebContent)
        // val inputStream = context.getResourceAsStream("/images/no_image.jpg")
        // this is a working alternative
        val inputStream = ClassPathResource("/static/images/no_image.jpg").inputStream
        val headers = HttpHeaders()
        headers.contentType = MediaType.IMAGE_PNG
        return ResponseEntity(inputStream.readBytes(), headers, HttpStatus.CREATED)
    }

    @ResponseBody
    @GetMapping("/v2", produces = [MediaType.IMAGE_JPEG_VALUE])
    @Throws(IOException::class)
    fun testPhoto2() : ByteArray {
        // I don't know where to place static resources in Spring Boot JAR in a way so they are accessible via ServletContext (WebContent)
        // val inputStream = context.getResourceAsStream("/images/no_image.jpg")
        // this is a working alternative
        val inputStream = ClassPathResource("/static/images/no_image.jpg").inputStream
        return inputStream.readBytes()
    }

    @RequestMapping("/v3")
    @Throws(IOException::class)
    fun testPhoto3(response: HttpServletResponse) {
        // I don't know where to place static resources in Spring Boot JAR in a way so they are accessible via ServletContext (WebContent)
        // val inputStream = context.getResourceAsStream("/images/no_image.jpg")
        // this is a working alternative
        val inputStream = ClassPathResource("/static/images/no_image.jpg").inputStream
        response.contentType = "image/jpeg"
        inputStream.copyTo(response.outputStream)
    }

    @ResponseBody
    @RequestMapping("/v4")
    @Throws(IOException::class)
    fun testPhoto4() : ByteArray {
        // I don't know where to place static resources in Spring Boot JAR in a way so they are accessible via ServletContext (WebContent)
        // val inputStream = context.getResourceAsStream("/images/no_image.jpg")
        // this is a working alternative
        val inputStream = ClassPathResource("/static/images/no_image.jpg").inputStream
        return inputStream.readBytes()
    }

}