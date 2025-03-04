package com.sree.java8Features.Predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateDemo {
    //2 inputs and 1 Boolean Output


    public static void main(String[] args) {
        BiPredicate<Integer, Integer> p = (num1, num2) -> num1>num2;
        System.out.println( p.test(34,12));
    }
}
