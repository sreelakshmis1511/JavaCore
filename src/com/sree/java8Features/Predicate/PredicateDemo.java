package com.sree.java8Features.Predicate;

import java.util.function.Predicate;

public class PredicateDemo {

    //PREDICATE = 1 Argument, 1 Boolean Return value
    public static void main(String[] args) {

        Predicate<Integer> isEven = n -> n%2 == 0;  //Argument and body of abstract method in Predicate functional interface
        Predicate<Integer> isGreaterThan50 = n -> n>40;

        System.out.println(isEven.test(23));
        System.out.println(isEven.and(isGreaterThan50).test(66));
        System.out.println(isEven.or(isGreaterThan50).test(15));
        System.out.println(isEven.negate().test(67));


    }
}
