package com.devdairy.rabbitmq.listenerclient;

import com.devdairy.rabbitmq.listenerclient.model.Transaction;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMqListener {

    @RabbitListener(queues="${rabbitmq.queue}")
    public void receiveMessage(Transaction transaction) {
        System.out.println("Received Message From MQ"+transaction);
    }
}
