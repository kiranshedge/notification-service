package com.rayedge.notification.consumer;

import com.rayedge.notification.dto.NotificationRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NotificationConsumer {

    @KafkaListener(topics = "notification-topic", groupId = "notification-group")
    public void consume(NotificationRequest request) {
        System.out.println("📩 Received notification: " + request.getMessage());
        log.info("Notification received; message='{}'", request.getMessage());
        // Here to add some call Email/SMS/Push notification logic
    }
}
