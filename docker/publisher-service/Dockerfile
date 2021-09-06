FROM maven:3-amazoncorretto-11 as builder
WORKDIR /publisher-subscriber-microserices
COPY .  /publisher-subscriber-microserices
RUN mvn clean install --projects publisher-service --also-make

FROM amazoncorretto:11-alpine
LABEL maintainer=lyes.sefiane@gmail.com
WORKDIR ./publisher-service
COPY --from=builder /publisher-subscriber-microserices/publisher-service/target/publisher-service-0.0.1-SNAPSHOT-jar-with-dependencies.jar /publisher-service/publisher-service.jar
RUN apk add --update curl && \
        rm -rf /var/cache/apk/* && \
        rm -rf /publisher-subscriber-microserices
EXPOSE 8080
ENTRYPOINT ["java","-jar","publisher-service.jar"]
