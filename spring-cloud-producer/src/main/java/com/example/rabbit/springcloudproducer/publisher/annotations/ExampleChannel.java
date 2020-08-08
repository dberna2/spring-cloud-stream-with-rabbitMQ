package com.example.rabbit.springcloudproducer.publisher.annotations;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface ExampleChannel {

    String OUTPUT = "exampleChannel";

    @Output(ExampleChannel.OUTPUT)
    MessageChannel output();
}
