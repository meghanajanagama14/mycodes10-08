package com.consumer;

import java.util.function.Predicate;
public class PredicateDemo {
    public static void main(String[] args) {
        int[] arr={12,23,11,19,25,32,16,22};
        Predicate<Integer> isEven = PredicateDemo::isEven;
        for (int num:arr) {
            if (isEven.test(num)) {
                System.out.println(num);
            }
        }
    }
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}