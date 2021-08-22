FROM openjdk:8-jdk-alpine
EXPOSE 9000
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} apirest-0.0.1-SNAPSHOT.jar
<<<<<<< HEAD
ENTRYPOINT ["java","-jar","/apirest-0.0.1-SNAPSHOT.jar"]
=======
ENTRYPOINT ["java","-jar","/apirest-0.0.1-SNAPSHOT.jar"]
>>>>>>> 6101c2ba58b6989907f2aacb580cede7fe78fa01
