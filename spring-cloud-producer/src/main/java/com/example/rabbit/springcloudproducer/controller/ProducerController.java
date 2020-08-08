package com.example.rabbit.springcloudproducer.controller;

import com.example.rabbit.springcloudproducer.domain.Person;
import com.example.rabbit.springcloudproducer.publisher.channel.IExampleChannelPublisher;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(
        value = "/producer",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
)
@AllArgsConstructor
public class ProducerController {

    private final IExampleChannelPublisher publisher;

    @PostMapping
    public ResponseEntity<Void> getAllUserById(@RequestBody Person person) {
        publisher.sendMessage(person);
        return ResponseEntity.accepted().build();
    }
}
