package com.rfds.dio.bootcamp.kafkamicroservice.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rfds.dio.bootcamp.kafkamicroservice.data.OrderData;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class SaveOrderService {

    @KafkaListener(topics = "SalvarPedido", groupId = "SaveOrderMicroservice")
    private void execute(ConsumerRecord<String, String> record) throws JsonProcessingException {
        System.out.println("Key " + record.key());
        System.out.println("Header " + record.headers());
        System.out.println("Partition " + record.partition());
        System.out.println("Value " + record.value());

        String data = record.value();
        ObjectMapper mapper = new ObjectMapper();
        OrderData orderData = null;
        orderData = mapper.readValue(data, OrderData.class);

        System.out.println("Objeto " + orderData);

    }
}
