package com.example.rabbit.springcloudproducer.publisher.channel;

import com.example.rabbit.springcloudproducer.domain.Person;

public interface IExamplePublisherChannel {

    void sendMessage(Person person);
}
