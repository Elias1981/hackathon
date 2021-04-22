#
# Build stage
#
FROM maven:3.6.0-jdk-11-slim AS build
COPY src src
COPY pom.xml pom.xml
RUN mvn clean package

#
# Package stage
#
FROM openjdk:8-jdk-alpine
RUN addgroup -S developer && adduser -S developer -G developer
USER developer:developer
ARG JAR_FILE=target/*.jar
COPY --from=build ${JAR_FILE} website.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/webstore.jar"]

