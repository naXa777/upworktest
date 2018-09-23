# UpWork Spring MVC test

The project includes code samples _similar_ to the ones in UpWork Spring MVC test.

A few important differences:

|                  | Language | Dependencies                             | Packaging |
| ---------------- | :-----:  | :--------------------------------------: | :-------: |
| UpWork test:     | Java     | Spring Web MVC                           | WAR       |
| This repository: | Kotlin   | Spring Boot 2 + Spring Boot Starter Web  | JAR       |

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
