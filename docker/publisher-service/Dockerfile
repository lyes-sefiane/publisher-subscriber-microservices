FROM openjdk:11
LABEL maintainer=lyes.sefiane@gmail.com
WORKDIR /app
COPY /publisher-service/target/publisher-service-0.0.1-SNAPSHOT-jar-with-dependencies.jar /app/publisher-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","publisher-service-0.0.1-SNAPSHOT.jar"]
