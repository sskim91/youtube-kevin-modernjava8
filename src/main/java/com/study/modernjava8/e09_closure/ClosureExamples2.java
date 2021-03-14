package com.study.modernjava8.e09_closure;

/**
 * @author sskim
 */
public class ClosureExamples2 {
    private int number = 999;

    public static void main(String[] args) {
        new ClosureExamples2().test();
    }

    private void test() {
//    int number = 100;

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(number);
            }
        };
        runnable.run();

        Runnable runnable1 = () -> System.out.println(number);
        runnable1.run();

    }
}
