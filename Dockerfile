# Use Zulu JDK 17 base image
FROM azul/zulu-openjdk:21-jdk

WORKDIR /app

COPY target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
