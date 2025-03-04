package com.sree.java8Features.Predicate;

import java.util.function.Predicate;

public class startwithA {
    //Write a Java program using Predicate<String> to check if a string starts with "A".

    public static void main(String[] args) {
        Predicate<String> isStartwithA = s -> s.startsWith("A");

        System.out.println( isStartwithA.test("SAnj") );
     }
}
