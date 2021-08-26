FROM amazoncorretto:11-alpine
LABEL maintainer=lyes.sefiane@gmail.com
WORKDIR /app
COPY publisher-service/target/publisher-service-0.0.1-SNAPSHOT-jar-with-dependencies.jar /app/publisher-service-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","publisher-service-0.0.1-SNAPSHOT.jar"]
