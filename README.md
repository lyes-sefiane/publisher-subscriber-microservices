# Publisher/Subscriber

## Project

## Architecture

## Requirements

```
1. Java 11.x.y

2. Maven 3.x.y

3. Docker 3.x.y
```

## Setup

### Git Clone

```
https://github.com/lsefiane/publisher-subscriber-microservices.git

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

# Spring Boot JMS with ActiveMQ "Classic"

## What Is JMS ?

The Java Message Service (JMS) was designed to make it easy to develop business applications that asynchronously send and receive business data and events. JMS defines a set of interfaces and semantics that allow Java applications to communicate with other messaging implementations. A JMS implementation is known as a JMS provider, such as : Apache ActiveMQ. [[1]](https://www.oracle.com/technical-resources/articles/java/intro-java-message-service.html)

## What Is ActiveMQ ?
*"Apache ActiveMQ® is the most popular open source, multi-protocol, Java-based message broker. It supports industry standard protocols so users get the benefits of client choices across a broad range of languages and platforms.... ActiveMQ offers the power and flexibility to support any messaging use-case."* [[2]](https://activemq.apache.org/)

## Message Delivery Models
JMS supports two different message delivery models:

### Point-to-Point (Queue destination)
*"In this model, a message is delivered from a producer to one consumer. The messages are delivered to the destination, which is a queue, and then delivered to one of the consumers registered for the queue. 
While any number of producers can send messages to the queue, each message is guaranteed to be delivered, and consumed by one consumer. If no consumers are registered to consume the messages, the queue holds them until a consumer registers to consume them."* [[1]](https://www.oracle.com/technical-resources/articles/java/intro-java-message-service.html)

### Publish/Subscribe (Topic destination)
*"In this model, a message is delivered from a producer to any number of consumers. Messages are delivered to the topic destination, and then to all active consumers who have subscribed to the topic. In addition, any number of producers can send messages to a topic destination, and each message can be delivered to any number of subscribers. If there are no consumers registered, the topic destination doesn't hold messages unless it has durable subscription for inactive consumers. A durable subscription represents a consumer registered with the topic destination that can be inactive at the time the messages are sent to the topic."* [[1]](https://www.oracle.com/technical-resources/articles/java/intro-java-message-service.html)

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://github.com/lsefiane/publisher-subscriber-microservices/blob/master/LICENSE.md)