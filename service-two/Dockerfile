FROM openjdk:8-alpine
ADD target/*.jar service-two.jar
ENTRYPOINT ["java","-jar","service-two.jar"]