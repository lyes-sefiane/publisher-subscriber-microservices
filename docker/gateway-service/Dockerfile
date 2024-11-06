FROM maven:3-amazoncorretto-17 as builder
WORKDIR /gateway-service/workspace
COPY gateway-service/pom.xml  /gateway-service/workspace
COPY gateway-service/src  /gateway-service/workspace/src
RUN mvn clean install


FROM amazoncorretto:11-alpine
LABEL maintainer=lyes.sefiane@gmail.com
WORKDIR /gateway-service
COPY --from=builder /gateway-service/workspace/target/gateway-service-0.0.1-SNAPSHOT.jar /gateway-service/gateway-service.jar
RUN apk add --update curl && \
    rm -rf /var/cache/apk/* && \
    rm -rf /gateway-service/workspace
EXPOSE 8080
ENTRYPOINT ["java","-jar","gateway-service.jar"]
