FROM openjdk:11
LABEL maintainer=lyes.sefiane@gmail.com
WORKDIR /app
COPY /gateway-service/target/gateway-service-0.0.1-SNAPSHOT.jar /app/gateway-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","gateway-service-0.0.1-SNAPSHOT.jar"]
