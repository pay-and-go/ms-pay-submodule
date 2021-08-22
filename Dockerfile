FROM openjdk:8-jdk-alpine
EXPOSE 9000
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} apirest-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/apirest-0.0.1-SNAPSHOT.jar"]
