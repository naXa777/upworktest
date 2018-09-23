package by.naxa.learning.upworktest.web

import mu.KotlinLogging
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.HandlerMapping
import javax.servlet.http.HttpServletRequest

@RestController
@RequestMapping("/rest")
class FooRestController {

    private val logger = KotlinLogging.logger {}

    /**
     * <strong>Which of the following statements is correct?</strong>
     * <br/>
     * Answer: It returns a JSON String and sets the mimetype to `text/javascript`.
     * P.E.: Actual response mimetype is `application/javascript` which is not listed in answers section.
     */
    @GetMapping("/fooBar")
    fun fooBar2() : ResponseEntity<String> {
        val json = "jsonResponse"
        val responseHeaders = HttpHeaders()
        responseHeaders.contentType = MediaType.APPLICATION_JSON
        return ResponseEntity(json, responseHeaders, HttpStatus.CREATED)
    }

    /**
     * <strong>What does the following code do?</strong><br/><br/>
     * Answer: It retrieves the partial path value (after {@code "**"}) before the {@link @RequestMapping} and {@link @PathVariable} values have been parsed.
     * <br/>
     * Stack Overflow: <a href="https://stackoverflow.com/q/40188743/1429387">Double asterisk in a request mapping</a>.
     * <br/>
     * Docs: <a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/servlet/HandlerMapping.html#PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE">HandlerMapping.html#PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE</a>
     * <br/>
     */
    @RequestMapping("/{id}/**")
    fun foo(@PathVariable("id") id: Int, request: HttpServletRequest) {
        val restOfTheUrl = request.getAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE) as String
        logger.info(restOfTheUrl)
    }

}