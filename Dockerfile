FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY target/survey-app-1.0-SNAPSHOT.jar app.jar

EXPOSE 8086

ENTRYPOINT ["java", "-jar", "app.jar"]
