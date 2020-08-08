package com.example.rabbit.springcloudproducer.publisher.annotations;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface ExampleOutputChannel {

    String OUTPUT = "exampleChannel";

    @Output(ExampleOutputChannel.OUTPUT)
    MessageChannel output();
}
