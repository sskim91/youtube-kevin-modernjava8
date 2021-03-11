package com.study.modernjava8;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class WhyJava8 {
    public static void main(String[] args) {

        final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //JAVA7 그런데 끝에 : 이 붙는다. 바꿔보면?
        final StringBuilder stringBuilder = new StringBuilder();
        for (Integer number : numbers) {
            stringBuilder.append(number).append(" : ");
        }
        System.out.println("JAVA7 = " + stringBuilder.toString());

        //JAVA8
        String collect = numbers.stream()
                .map(String::valueOf)
                .collect(joining(" : "));
        System.out.println("JAVA8 = " + collect);

    }
}
