package com.example.rabbit.springcloudproducer.publisher.channel.impl;

import com.example.rabbit.springcloudproducer.domain.Person;
import com.example.rabbit.springcloudproducer.publisher.channel.IExampleChannelPublisher;
import com.example.rabbit.springcloudproducer.publisher.annotations.ExampleChannel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@EnableBinding(ExampleChannel.class)
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ExampleChannelPublisherImpl implements IExampleChannelPublisher {

    private final ExampleChannel source;

    @Override
    public void sendMessage(Person person) {
        log.info("Sending person: {}", person);
        source.output().send(MessageBuilder.withPayload(person).build());
        log.info("Message sent successfully");
    }
}
