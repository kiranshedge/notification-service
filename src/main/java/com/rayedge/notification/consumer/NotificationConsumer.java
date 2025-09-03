package com.rayedge.notification.consumer;

import com.rayedge.notification.dto.NotificationRequest;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationConsumer {

    @KafkaListener(topics = "notification-topic", groupId = "notification-group")
    public void consume(NotificationRequest request) {
        System.out.println("📩 Received notification: " + request.getMessage());
        // Here you could call Email/SMS/Push notification logic
    }
}
