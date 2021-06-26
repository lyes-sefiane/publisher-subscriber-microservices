FROM openjdk:11
LABEL maintainer=lyes.sefiane@gmail.com
WORKDIR /app
COPY /subscriber-service/target/subscriber-service-0.0.1-SNAPSHOT-jar-with-dependencies.jar /app/subscriber-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","subscriber-service-0.0.1-SNAPSHOT.jar"]