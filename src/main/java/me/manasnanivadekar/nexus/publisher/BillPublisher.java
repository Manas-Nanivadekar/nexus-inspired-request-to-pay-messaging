package me.manasnanivadekar.nexus.publisher;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import me.manasnanivadekar.nexus.dto.RtpBill;
import me.manasnanivadekar.nexus.dto.RtpBillStatus;
import me.manasnanivadekar.nexus.config.MessagingConfig;

@RestController
@RequestMapping("/bill")
public class BillPublisher {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @PostMapping()
    public String nexusMessage(@RequestBody RtpBill rtpbill) {
        RtpBillStatus status = new RtpBillStatus(rtpbill, "DONE", "message sent successfully");
        rabbitTemplate.convertAndSend(MessagingConfig.EXCHANGE_NAME, MessagingConfig.ROUTING_KEY, status);
        return "bill sent successfully";
    }
}
