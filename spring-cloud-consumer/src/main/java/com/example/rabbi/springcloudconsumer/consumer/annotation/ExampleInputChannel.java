package com.example.rabbi.springcloudconsumer.consumer.annotation;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

public interface ExampleConsumerChannel {

    String INPUT = "exampleChannel";

    @Input(ExampleConsumerChannel.INPUT)
    MessageChannel input();
}
