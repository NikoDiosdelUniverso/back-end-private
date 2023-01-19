
FROM openjdk:18-jdk-alpine
COPY target/portfolio-backend.jar portfolio-backend.jar
ENTRYPOINT ["java","-jar","/portfolio-backend.jar"]