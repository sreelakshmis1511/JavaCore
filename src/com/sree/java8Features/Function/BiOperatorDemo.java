package com.sree.java8Features.Function;

import java.util.function.BinaryOperator;

public class BiOperatorDemo {

    //2 inputs and 1 output are of same dataType

    public static void main(String[] args) {
        BinaryOperator<Integer> sm = (n1,n2) -> n1+n2;
        System.out.println(sm.apply(11,22));
    }
}
