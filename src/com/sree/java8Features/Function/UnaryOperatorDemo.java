package com.sree.java8Features.Function;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

    public static void main(String[] args) {

        UnaryOperator<String> upperCase = s -> s.toUpperCase();
        System.out.println(upperCase.apply("lower"));


        UnaryOperator<Integer> sum = n -> n+10;
        System.out.println(sum.apply(12));
    }
}
