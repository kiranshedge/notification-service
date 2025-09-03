package com.rayedge.notification.config;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class KafkaBootstrapLogger {

    @Autowired
    private Environment environment;

    @PostConstruct
    public void logKafkaBootstrap() {
        System.out.println(">>> Kafka bootstrap servers = " +
                environment.getProperty("spring.kafka.bootstrap-servers"));
    }
}
