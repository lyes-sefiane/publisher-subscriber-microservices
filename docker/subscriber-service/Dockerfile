FROM amazoncorretto:11-alpine
LABEL maintainer=lyes.sefiane@gmail.com
WORKDIR /app
COPY subscriber-service/target/subscriber-service-0.0.1-SNAPSHOT-jar-with-dependencies.jar /app/subscriber-service-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","subscriber-service-0.0.1-SNAPSHOT.jar"]