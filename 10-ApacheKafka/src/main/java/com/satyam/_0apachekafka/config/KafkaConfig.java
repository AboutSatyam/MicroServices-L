package com.satyam._0apachekafka.config;

import com.satyam._0apachekafka.model.Customer;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;

@Configuration
public class KafkaConfig {
    public KafkaTemplate<String, Customer> kafkaTemplate() {
        return new KafkaTemplate<String, Customer>(ProducerFactory());
    }
}
