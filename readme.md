# RabbitMq Consumer
## Branches Details of this Repo
* master  (have the basic Direct Exchange related Listener code)
    *[Producer Repo Link](https://github.com/sanjeevi-gopaluni/rabbitmq-web-producer)
* topic-exchange  (have the Topic Exchange related Listener code (change application.properties file according to your queues, exchanges))
    *[Producer Repo Link](https://github.com/sanjeevi-gopaluni/rabbitmq-web-producer/tree/topic-exchange)
### Please run the server Before executing this [RabbitMq Producer](https://github.com/sanjeevi-gopaluni/rabbitmq-web-producer)  repo
### Prerequests
* start the rabbitmq server (ex service rabbitmq-server start)
### How To Start
* mvn spring-boot:run will start the server
### How to check
* assume [rabbitmq-producer](https://github.com/sanjeevi-gopaluni/rabbitmq-web-producer) is running in 8080 port
* hit the url in browser http://localhost:8080/transaction?id=12345&amt=102&type=dr
* in the consumer console will see the  log of that Message

