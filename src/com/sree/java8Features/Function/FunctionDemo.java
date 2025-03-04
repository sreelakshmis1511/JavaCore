package com.sree.java8Features.Function;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {

        Function<String, String> id = Function.identity();  //IDENTITY METHOD same output as input
        System.out.println(id.apply("Hi Identity function"));


        Function<Integer, Integer> num1 = n -> n+2;
        Function<Integer, Integer> num2 = n -> n*2;
        Function<Integer, Integer> num3 = num1.compose(num2); //f.compose(g) means g is applied first, and then f is applied.
        System.out.println(num3.apply(2));


        Function<Integer, Integer> op1 = n -> n+2;
        Function<Integer, Integer> op2 = n -> n*2;
        Function<Integer, Integer> res = op1.andThen(op2); //f.andThen(g) means f is applied first, and then g is applied.
        System.out.println(res.apply(2));
    }
}
