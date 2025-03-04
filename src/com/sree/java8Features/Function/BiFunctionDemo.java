package com.sree.java8Features.Function;

import java.util.function.BiFunction;

public class BiFunctionDemo {
//2 inputs and 1 output

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> sum = (num1, num2) -> num1+num2;
        System.out.println(sum.apply(10, 23));
    }

}
