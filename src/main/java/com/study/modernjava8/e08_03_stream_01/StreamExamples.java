package com.study.modernjava8.e08_03_stream_01;

import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author sskim
 */
public class StreamExamples {
    public static void main(String[] args) {
        range();
        /**
         * 무한스트림
         */
//    infiniteCollection1();
//    infiniteCollection2();
    }

    private static void range() {
        /**
         * range는 끝 숫자는 포함하지않음.
         * 0 1 2 3 4 5 6 7 8 9
         */
        IntStream.range(0, 10)
                .forEach(i -> System.out.print(i + " "));

        System.out.println("");
        /**
         * rangedClosed는 끝 숫자까지 포함.
         * 1 2 3 4 5 6 7 8 9 10
         */
        IntStream.rangeClosed(1, 10)
                .forEach(i -> System.out.print(i + " "));
    }

    /**
     * int를 이용한 무한 Collection
     */
    private static void infiniteCollection1() {
        IntStream.iterate(1, i -> i + 1)
                .forEach(i -> System.out.print(i + " "));
    }

    /**
     * BigInteger를 이용한 무한 Collection
     */
    private static void infiniteCollection2() {
        Stream.iterate(BigInteger.ONE, i -> i.add(BigInteger.ONE))
                .forEach(i -> System.out.print(i + " "));
    }
}
