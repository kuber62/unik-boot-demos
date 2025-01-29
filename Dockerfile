FROM openjdk:8-alpine
ADD target/demo-boot.jar demo-boot.jar
ENTRYPOINT ["java","-jar","/demo-boot.jar","--server.port=5000"]
EXPOSE 5000