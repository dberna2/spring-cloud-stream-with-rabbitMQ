package com.example.rabbit.springcloudproducer;

import com.example.rabbit.springcloudproducer.domain.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudProducerApplication {

    public static void main(String[] args) {

        Person p = new Person("d","name", 2);

        p = new Person("d","name", 2);
        SpringApplication.run(SpringCloudProducerApplication.class, args);
    }

}
