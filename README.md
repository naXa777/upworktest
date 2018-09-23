# UpWork Spring MVC test

The project includes code samples _similar_ to the ones in [UpWork Spring MVC test](https://www.upwork.com/ab/tests/test/996).

A few important differences:

|                  | Language | Dependencies                             | Packaging |
| ---------------- | :-----:  | :--------------------------------------: | :-------: |
| UpWork test:     | [Java](https://www.java.com/)       | [Spring Web MVC](https://docs.spring.io/spring/docs/current/spring-framework-reference/web.html#mvc) | [WAR](https://spring.io/understanding/WAR)                                                |
| This repository: | [Kotlin](https://kotlinlang.org/)   | [Spring Boot 2](https://spring.io/projects/spring-boot) + Spring Boot Starter Web                     | [JAR](https://docs.spring.io/spring-boot/docs/current/reference/html/executable-jar.html) |

Additional tools used to make this app great:

1. [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#production-ready)
2. [Spring Boot Admin](https://github.com/codecentric/spring-boot-admin)
3. [kotlin-logging](https://github.com/MicroUtils/kotlin-logging)

## Usage

[Clone](https://help.github.com/articles/cloning-a-repository/) this repo.

## Build

```shell
./gradlew build
```

## Run

```shell
./gradlew bootRun
```

Navigate to http://localhost:8080/actuator/health

## Distribution

```shell
./gradlew bootJar
```

Look for the output in /build/libs folder.

### Try the Web Admin panel
 
Navigate to http://localhost:8080/#/wallboard > Select the app instance > Web > Mappings

![Spring Boot Admin > Mappings](/screenshots/spring-boot-admin-mappings.png)
