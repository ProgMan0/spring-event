FROM openjdk:17-jdk-slim
EXPOSE 8080
WORKDIR /app
COPY /target/pastebin-0.0.1-SNAPSHOT.jar server.jar
ENTRYPOINT ["java", "-jar", "server.jar"]