# Stats Data Football

This project provides apifootball data collection and supply.

### Maintainer


**GitHub**: [#andeoliveira](https://github.com/andeoliveira)

## Stack

- **[Java](https://jdk.java.net/19/)**: For Server-side Development
- **[Spring Boot](https://spring.io/projects/spring-boot)**: Web Framework
- **[Spring Data/JPA](https://spring.io/projects/spring-data-jpa)**: Persistence Framework for Postgres
- **[PostgreSQL](https://www.postgresql.org/)**: Database

## Prerequisites

- **[Required]** [Java JDK 19](https://jdk.java.net/19/)
- **[Required]** [Docker](https://docs.docker.com/desktop/install/windows-install/)
- **[Required]** [Maven 3.8.6](https://maven.apache.org/download.cgi)
- **[Optional]** [Jetbrains IntelliJ IDEA](https://www.jetbrains.com/idea/download/#section=linux)

## Architecture Diagram
WIP

## Dependences
* Spring Boot
* Maven
* Flayway
* Open Feign
* Arch Unit

### Environment

* Local: http://localhost:8080
* Development: WIP
* Production: WIP

### API Documentation

* Developer Catalogue: WIP


## Building and running

#### Setup infrastructure
This project use [Docker](https://docs.docker.com/desktop/install/windows-install/) as supporter.
- *Make sure you are running java 19*
- Run the command in terminal/cmd: *docker-compose up -d*

#### Run project in Intellij

Simple run *StatsDataCollectorApplication* class in your Intellij.

To verify that the application is running, just call the health check:
[http://localhost:8080/health](http://localhost:8080/health)



