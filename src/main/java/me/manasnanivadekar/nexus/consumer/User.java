package me.manasnanivadekar.nexus.consumer;

import me.manasnanivadekar.nexus.config.MessagingConfig;
import me.manasnanivadekar.nexus.dto.RtpMessageStatus;

import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

@Component
public class User {
    @RabbitListener(queues = MessagingConfig.QUEUE_NAME)
    public void consume(RtpMessageStatus message) {
        System.out.println("Received message: " + message);
    }
}
