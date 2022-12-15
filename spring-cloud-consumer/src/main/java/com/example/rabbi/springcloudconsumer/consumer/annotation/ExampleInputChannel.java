package com.example.rabbi.springcloudconsumer.consumer.annotation;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

public interface ExampleInputChannel {

    String INPUT = "exampleChannel";

    @Input(ExampleInputChannel.INPUT)
    MessageChannel input();
}
