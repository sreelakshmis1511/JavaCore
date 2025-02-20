package com.sree.java8Features;

public class Lambda2 {

    public static void main(String[] args) {

        FunctionalINterface2 fn = (n1, n2) -> n1 + n2;  //return type of n1+n2 is return type declared in abstract method

        fn.sum(4,5);
    }
}
