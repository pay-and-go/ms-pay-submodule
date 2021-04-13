FROM openjdk:8-jdk-alpine
EXPOSE 9000
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} apirest.jar
ENTRYPOINT ["java","-jar","/apirest.jar"]