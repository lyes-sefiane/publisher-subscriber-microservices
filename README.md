# Publisher/Subscriber Microservices

## License

[Creative Commons Attribution-NonCommercial-NoDerivs 4.0 International License][cc-by-nc-nd].

[![CC BY-NC-ND 4.0][cc-by-nc-nd-image]][cc-by-nc-nd]

[cc-by-nc-nd]: http://creativecommons.org/licenses/by-nc-nd/4.0/
[cc-by-nc-nd-image]: https://licensebuttons.net/l/by-nc-nd/4.0/88x31.png
[cc-by-nc-nd-shield]: https://img.shields.io/badge/License-CC%20BY--NC--ND%204.0-lightgrey.svg

## GitHub Badges

![GitHub Repo stars](https://img.shields.io/github/stars/lyes-sefiane/publisher-subscriber-microservices?style=social)
![GitHub top language](https://img.shields.io/github/languages/top/lyes-sefiane/publisher-subscriber-microservices)
![GitHub commit activity (branch)](https://img.shields.io/github/commit-activity/y/lyes-sefiane/publisher-subscriber-microservices/master)

## Wiki
* [lyes-sefiane/publisher-subscriber-microservices/wiki/event-driven-microservices](https://github.com/lyes-sefiane/publisher-subscriber-microservices/wiki/Event-Driven-Microservices)

## Technology Stack
* [lyes-sefiane/publisher-subscriber-microservices/wiki/technology-stack](https://github.com/lyes-sefiane/publisher-subscriber-microservices/wiki/Technology-Stack)

## Requirements
```
1. Java 11.x.y

2. Maven 3.x.y

3. Docker 3.x.y
```

## Git Clone
```
https://github.com/lyes-sefiane/publisher-subscriber-microservices.git
```

## Development Environment

* [lyes-sefiane/publisher-subscriber-microservices/wiki/development-environment](https://github.com/lyes-sefiane/publisher-subscriber-microservices/wiki/Development-Environment)

```
docker-compose --env-file .env up --build -d
```

![Image](https://raw.githubusercontent.com/wiki/lyes-sefiane/publisher-subscriber-microservices/images/Dev-Mode.PNG)

## Developmental Test & Evaluation
* [lyes-sefiane/publisher-subscriber-microservices/wiki/developmental-test-and-evaluation](https://github.com/lyes-sefiane/publisher-subscriber-microservices/wiki/Developmental-Test-&-Evaluation)

## Orchestration with Docker Swarm

* [lyes-sefiane/publisher-subscriber-microservices/wiki/docker-swarm](https://github.com/lyes-sefiane/publisher-subscriber-microservices/wiki/Docker-Swarm)

![Image](https://raw.githubusercontent.com/wiki/lyes-sefiane/publisher-subscriber-microservices/images/Orchestration-Swarm.PNG)

![Image](https://raw.githubusercontent.com/wiki/lyes-sefiane/publisher-subscriber-microservices/images/docker-swarm-visualizer.PNG)

### Deployment
```
docker stack deploy -c docker-stack.yml stack
```
## Orchestration with Kubernetes

* [lyes-sefiane/publisher-subscriber-microservices/wiki/kubernetes](https://github.com/lyes-sefiane/publisher-subscriber-microservices/wiki/Kubernetes)

![Image](https://raw.githubusercontent.com/wiki/lyes-sefiane/publisher-subscriber-microservices/images/kubernetes-cluster.PNG)

![Image](https://raw.githubusercontent.com/wiki/lyes-sefiane/publisher-subscriber-microservices/images/kubernetes-deployment.PNG)

### Deployment
```
kubectl apply -f k8s/
```

## Enhancements

* OpenApi Implementation 
* Error Handling Implementation 
* Database access/storage Implementation
* Security Implementation

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.
