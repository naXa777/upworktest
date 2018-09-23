package by.naxa.learning.upworktest

import de.codecentric.boot.admin.server.config.EnableAdminServer
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@EnableAdminServer
@SpringBootApplication
class UpworktestApplication

fun main(args: Array<String>) {
    runApplication<UpworktestApplication>(*args)
}
