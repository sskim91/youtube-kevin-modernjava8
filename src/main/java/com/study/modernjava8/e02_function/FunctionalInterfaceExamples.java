package com.study.modernjava8.e02_function;

import java.util.function.Function;

public class FunctionalInterfaceExamples {
    public static void main(String[] args) {

//        Function<String, Integer> toInt = (String value) -> Integer.parseInt(value);

        //메소드참조로 변경
        Function<String, Integer> toInt = Integer::parseInt;

        Integer number = toInt.apply("100");
        System.out.println("number = " + number);

        //같은 타입을 받아서 같은 타입으로 반환하는 것을 identity 라고한다.
        Function<Integer, Integer> identity = Function.identity();
//        Function<Integer, Integer> identity = (Integer i) -> i*2;
        System.out.println(identity.apply(999));
    }
}
