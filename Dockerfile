# Базовый образ
FROM eclipse-temurin:17-jdk-jammy

# Установка директории для приложения
WORKDIR /app

# Копирование JAR файла в контейнер
COPY target/pastebin-0.0.1-SNAPSHOT.jar app.jar

# Установка активного профиля (профиль можно переопределить через Docker Compose)
ENV SPRING_PROFILES_ACTIVE=prod

# Запуск приложения
ENTRYPOINT ["java", "-Dspring.profiles.active=${SPRING_PROFILES_ACTIVE}", "-jar", "app.jar"]
