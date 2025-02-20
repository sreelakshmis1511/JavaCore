package com.sree.java8Features;

public class Lambda1 {

    public static void main(String[] args) {

        FunctionalInterface1 fn = () -> System.out.println("First Functional Interface");

        fn.arithmetic();           //when abstract method is called, above is printed
    }
}
