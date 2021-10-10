package me.manasnanivadekar.nexus.publisher;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import me.manasnanivadekar.nexus.dto.RtpMessage;
import me.manasnanivadekar.nexus.dto.RtpMessageStatus;
import me.manasnanivadekar.nexus.config.MessagingConfig;

@RestController
@RequestMapping("/message")
public class MessagePublisher {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @PostMapping("/{approvalStatus}")
    public String nexusMessage(@RequestBody RtpMessage rtpmessage, @PathVariable String approvalStatus) {
        RtpMessageStatus status = new RtpMessageStatus(rtpmessage, approvalStatus, "message sent successfully");
        rabbitTemplate.convertAndSend(MessagingConfig.EXCHANGE_NAME, MessagingConfig.ROUTING_KEY, status);
        return "message sent successfully";
    }
}
