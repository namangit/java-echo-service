FROM maven:3.5.0-jdk-8-alpine
EXPOSE 8080
ADD target/echo-service-1.0-SNAPSHOT.jar /echo-service.jar
CMD ["java", "-jar", "/echo-service.jar"]