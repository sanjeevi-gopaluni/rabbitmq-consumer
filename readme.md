# RabbitMq Consumer
This is an example of rabbitmq listener with topic-exchange related to all routingKey , all routing key is mapped as '*' so any routing Key will hit this listener 
### Please run the server Before executing this [RabbitMq Producer](https://github.com/sanjeevi-gopaluni/rabbitmq-web-producer)  repo
### Prerequests
* start the rabbitmq server (ex service rabbitmq-server start)
### How To Start
* mvn spring-boot:run will start the server
### How to check
* assume [rabbitmq-producer](https://github.com/sanjeevi-gopaluni/rabbitmq-web-producer) is running in 8080 port
* hit the url in browser http://localhost:8080/transaction?id=12345&amt=102&type=dr
* in the consumer console will see the  log of that Message

### how to check
http://localhost:8080/topic/transaction?id=22348&amt=102&type=dr&exchange=topic-exchange&routingKey=logs
http://localhost:8080/topic/transaction?id=22349&amt=102&type=dr&exchange=topic-exchange&routingKey=transactions
http://localhost:8080/topic/transaction?id=22349&amt=102&type=dr&exchange=topic-exchange&routingKey=admin
http://localhost:8080/topic/transaction?id=22349&amt=102&type=dr&exchange=topic-exchange&routingKey=anything

will hit the listener