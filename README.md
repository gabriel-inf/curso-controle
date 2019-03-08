# Controle Curso

This project is a solution to make the work for people that has to manage courses easier.

It is a Spring Boot aplication that exposes APIs


In order to run the project: 

    ./mvnw clean package && java -jar target/controle-0.0.1-SNAPSHOT.jar


Database for local development:

    docker run --name curso -e MYSQL_ROOT_PASSWORD=cursopass -d mysql:tag

Connect to the database via command line: 

    docker run -it --link curso:mysql --rm mysql sh -c 'exec mysql -h"$MYSQL_PORT_3306_TCP_ADDR" -P"$MYSQL_PORT_3306_TCP_PORT" -uroot -p"$MYSQL_ENV_MYSQL_ROOT_PASSWORD"'


Starting the database: 

    docker start curso


# Technologies

- Spring Boot
- Java
- JPA
- Restful API

# Integration test master

[![Build Status](https://travis-ci.com/gabriel-inf/curso-controle.svg?branch=master)](https://travis-ci.com/gabriel-inf/curso-controle)