FROM eclipse-temurin:17-jdk

# Erstelle ein Verzeichnis für die App
WORKDIR /app

# Kopiere die JAR-Datei in das Container-Verzeichnis
COPY build/libs/*.jar app.jar

# Exponiere den Port 8080
EXPOSE 8080

# Startbefehl
ENTRYPOINT ["java", "-jar", "app.jar"]
