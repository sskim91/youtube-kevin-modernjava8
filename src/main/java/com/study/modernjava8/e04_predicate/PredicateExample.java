package com.study.modernjava8.e04_predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

//        Predicate<String> predicate = value -> value.isEmpty();
        Predicate<String> predicate = String::isEmpty;
        System.out.println("test = " + predicate.test(""));

        Predicate<Integer> isPositive = value -> value > 0;
        System.out.println(isPositive.test(1));
        System.out.println(isPositive.test(0));
        System.out.println(isPositive.test(-1));

        //less than 3
        Predicate<Integer> lessThan3 = value -> value < 3;

        List<Integer> numbers = Arrays.asList(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5);

        //JAVA8
        System.out.println("positive integers: " + filter(numbers, isPositive));
        //복잡하지 않으면 바로 넘겨줘도 된다. 그러나 isPositive 같은 이해하기 쉽게 넘겨주는게 더 좋을수도있다.
        System.out.println("positive integers: " + filter(numbers, i -> i > 0));
        System.out.println("less than 3: " + filter(numbers, lessThan3));
        System.out.println("less than 3: " + filter(numbers, i -> i < 3));
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> filter) {
        List<T> result = new ArrayList<>();
        for (T item : list) {
            if (filter.test(item)) {
                result.add(item);
            }
        }
        return result;
    }
}
