FROM maven:3.6.0-jdk-11-slim AS build
LABEL maintainer="Xenofon Zinoviou"
LABEL version="1.0"
COPY . /usr/app/
RUN mvn -f /usr/app/pom.xml clean package

FROM adoptopenjdk:11-jdk-openj9
COPY --from=build /usr/app/target/shark-app.jar /usr/local/lib/app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/app.jar"]
