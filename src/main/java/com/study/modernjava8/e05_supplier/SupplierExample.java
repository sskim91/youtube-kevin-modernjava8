package com.study.modernjava8.e05_supplier;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> helloSupplier = () -> "Hello ";
        System.out.println(helloSupplier.get() + "World");

        long start = System.currentTimeMillis();
//        printIfValidIndex(0, getVeryExpensiveValue());
//        printIfValidIndex(-1, getVeryExpensiveValue());
//        printIfValidIndex(-2, getVeryExpensiveValue());
        printIfValidIndex(0, () -> getVeryExpensiveValue());
        printIfValidIndex(-1, () -> getVeryExpensiveValue());
        printIfValidIndex(-2, () -> getVeryExpensiveValue());
        System.out.println("It took " + ((System.currentTimeMillis() - start) / 1000) + " seconds.");
    }

    private static String getVeryExpensiveValue() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Let`s just say it has very expensive calculation here!
        return "sskim";
    }

    //    private static void printIfValidIndex(int number, String value) {
    private static void printIfValidIndex(int number, Supplier<String> valueSupplier) {
        if (number >= 0) {
            System.out.println("The value is " + valueSupplier.get() + ".");
        } else {
            System.out.println("Invalid");
        }
    }
}
