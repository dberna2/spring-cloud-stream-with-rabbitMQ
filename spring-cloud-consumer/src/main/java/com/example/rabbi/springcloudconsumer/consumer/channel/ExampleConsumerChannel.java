package com.example.rabbi.springcloudconsumer.consumer.channel;

import com.example.rabbi.springcloudconsumer.consumer.annotation.ExampleConsumerChannel;
import com.example.rabbi.springcloudconsumer.domain.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@Slf4j
@EnableBinding(ExampleConsumerChannel.class)
public class ExampleChannelConsumer {

    @StreamListener(target = ExampleConsumerChannel.INPUT)
    public void consumer(Person person) {
        log.info("Person receive: {}", person);
    }
}
