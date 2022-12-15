package com.example.rabbi.springcloudconsumer.consumer.channel;

import com.example.rabbi.springcloudconsumer.consumer.annotation.ExampleInputChannel;
import com.example.rabbi.springcloudconsumer.domain.Person;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@Slf4j
@AllArgsConstructor
@EnableBinding(ExampleInputChannel.class)
public class ExampleConsumerChannel {

    @StreamListener(target = ExampleInputChannel.INPUT)
    public void consumer(Person person) {
        log.info("Person receive: {}", person);
    }
}
