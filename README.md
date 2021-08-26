# Publisher/Subscriber Microservices Sample

## Wiki

[lyes-s/publisher-subscriber-microservices/wiki/Event-Driven-Microservices](https://github.com/lyes-s/publisher-subscriber-microservices/wiki/Event-Driven-Microservices)

## [Architecture](https://github.com/lyes-s/publisher-subscriber-microservices/wiki/Architecture)

![Image](https://raw.githubusercontent.com/wiki/lyes-s/publisher-subscriber-microservices/images/PubSub%20Microservices%20Architecture.PNG)

## [Requirements](https://github.com/lyes-s/publisher-subscriber-microservices/wiki/Technology-Stack)

```
1. Java 11.x.y

2. Maven 3.x.y

3. Docker 3.x.y
```

## [Setup](https://github.com/lyes-s/publisher-subscriber-microservices/wiki/Installation)

### Git Clone

```
https://github.com/lyes-s/publisher-subscriber-microservices.git

```

### Maven Build

```
cd publisher-subscriber-microservices/

mvn clean install

```

### Docker Compose

```
docker-compose --env-file .env up -d

```

## [Testing](https://github.com/lyes-s/publisher-subscriber-microservices/wiki/Testing)

```
POST : localhost:8080/publisher/publish/virtual-topic

Body
{
    "description": "description sample..."
}

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
