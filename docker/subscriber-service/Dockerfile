FROM maven:3-amazoncorretto-11 as builder
WORKDIR /publisher-subscriber-microserices
COPY .  /publisher-subscriber-microserices
RUN mvn clean install --projects subscriber-service --also-make

FROM amazoncorretto:11-alpine
LABEL maintainer=lyes.sefiane@gmail.com
WORKDIR ./subscriber-service
COPY --from=builder /publisher-subscriber-microserices/subscriber-service/target/subscriber-service-0.0.1-SNAPSHOT-jar-with-dependencies.jar /subscriber-service/subscriber-service.jar
RUN apk add --update curl && \
        rm -rf /var/cache/apk/* && \
        rm -rf /publisher-subscriber-microserices
EXPOSE 8080
ENTRYPOINT ["java","-jar","subscriber-service.jar"]