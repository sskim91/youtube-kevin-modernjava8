package com.study.modernjava8.e03_consumer;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

//        Consumer<String> print = value -> System.out.println(value);
        Consumer<String> print = System.out::println;
        Consumer<String> greetings = (String value) -> System.out.println("Hello "+ value);
        print.accept("hello lambda");
        greetings.accept("sskim");
    }
}
