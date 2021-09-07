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

## Orchestration with Docker Swarm

* [lyes-s/publisher-subscriber-microservices/wiki/Docker-Swarm-Deployment](https://github.com/lyes-s/publisher-subscriber-microservices/wiki/Docker-Swarm-Deployment)

```
docker stack deploy -c docker-stack.yml stack
```

## Testing
* [lyes-s/publisher-subscriber-microservices/wiki/Testing](https://github.com/lyes-s/publisher-subscriber-microservices/wiki/Testing)


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
