FROM openjdk:11
EXPOSE 8080
COPY target/spring-boot-mysql-docker-compose.jar  spring-boot-mysql-docker-compose.jar
ENTRYPOINT [ "java", "-jar", "/spring-boot-mysql-docker-compose.jar"]