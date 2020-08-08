package com.example.rabbit.springcloudproducer.publisher.channel.impl;

import com.example.rabbit.springcloudproducer.domain.Person;
import com.example.rabbit.springcloudproducer.publisher.channel.IExamplePublisherChannel;
import com.example.rabbit.springcloudproducer.publisher.annotations.ExampleOutputChannel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@EnableBinding(ExampleOutputChannel.class)
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ExamplePublisherChannelImpl implements IExamplePublisherChannel {

    private final ExampleOutputChannel source;

    @Override
    public void sendMessage(Person person) {
        log.info("Sending person: {}", person);
        source.output().send(MessageBuilder.withPayload(person).build());
        log.info("Message sent successfully");
    }
}
