#FROM eclipse-temurin:17-jdk-alpine
#WORKDIR /app
#COPY build/libs/webtech-0.0.1-SNAPSHOT.jar app.jar
#ENTRYPOINT ["java","-jar","app.jar"]


FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY build/libs/webtech-0.0.1-SNAPSHOT.jar app.jar
RUN chmod +x ./gradlew
RUN ./gradlew clean build -x test
COPY build/libs/webtech-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
