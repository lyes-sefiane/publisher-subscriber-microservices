# Publisher/Subscriber Microservices Sample

## Wiki
* [lyes-s/publisher-subscriber-microservices/wiki/Event-Driven-Microservices](https://github.com/lyes-s/publisher-subscriber-microservices/wiki/Event-Driven-Microservices)

## Architecture

* [lyes-s/publisher-subscriber-microservices/wiki/Architecture](https://github.com/lyes-s/publisher-subscriber-microservices/wiki/Architecture)

![Image](https://raw.githubusercontent.com/wiki/lyes-s/publisher-subscriber-microservices/images/PubSub%20Microservices%20Architecture.PNG)

## Technology Stack
* [lyes-s/publisher-subscriber-microservices/wiki/Technology-Stack](https://github.com/lyes-s/publisher-subscriber-microservices/wiki/Technology-Stack)

## Requirements
```
1. Java 11.x.y

2. Maven 3.x.y

3. Docker 3.x.y
```

## Git Clone
```
https://github.com/lyes-s/publisher-subscriber-microservices.git
```

## Project Directory

```
cd publisher-subscriber-microservices/
```

## Development Environment

* [lyes-s/publisher-subscriber-microservices/wiki/Development-Environment](https://github.com/lyes-s/publisher-subscriber-microservices/wiki/Development-Environment)

```
docker-compose --env-file .env up --build -d
```

## Developmental Test & Evaluation
* [lyes-s/publisher-subscriber-microservices/wiki/Developmental-Test-&-Evaluation](https://github.com/lyes-s/publisher-subscriber-microservices/wiki/Developmental-Test-&-Evaluation)


## Orchestration with Docker Swarm

* [lyes-s/publisher-subscriber-microservices/wiki/Docker-Swarm-Deployment](https://github.com/lyes-s/publisher-subscriber-microservices/wiki/Docker-Swarm-Deployment)

### Environment Variables Export
```
export SPRING_ACTIVEMQ_BROKER_URL=tcp://apache-activemq:61616 \
export SPRING_JMS_LISTENER_AUTO_STARTUP=true \
export SPRING_CLOUD_CONSUL_ENABLED=true \
export SPRING_CLOUD_GATEWAY_DISCOVERY_LOCATOR_ENABLED=true \
export SPRING_CLOUD_CONSUL_HOST=http://hashicorp-consul \
export SPRING_CLOUD_CONSUL_PORT=8500 \
export SPRING_ZIPKIN_ENABLED=true \
export SPRING_ZIPKIN_BASE_URL=http://openzipkin-zipkin:9411
```
### Secrets Creation
```
echo "admin" | docker secret create activemq_user -
echo "admin" | docker secret create activemq_password -
```

### Stack Deployment
```
docker stack deploy -c docker-stack.yml stack
```

## Enhancements

* OpenApi Implementation 
* Error Handling Implementation 
* Database access/storage Implementation
* Security Implementation

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://github.com/lyes-s/publisher-subscriber-microservices/blob/master/LICENSE.md)
