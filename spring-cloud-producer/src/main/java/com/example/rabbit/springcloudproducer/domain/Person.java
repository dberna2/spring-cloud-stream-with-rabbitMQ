package com.example.rabbit.springcloudproducer.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public final class Person {

    private final String id;
    private final String name;
    private final int age;
}
