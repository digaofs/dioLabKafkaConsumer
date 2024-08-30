package com.rfds.dio.bootcamp.kafkamicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class KafkamicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkamicroserviceApplication.class, args);
	}

}
