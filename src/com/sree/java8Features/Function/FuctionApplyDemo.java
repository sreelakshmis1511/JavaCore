package com.sree.java8Features.Function;

import java.util.function.Function;

public class FuctionApplyDemo {

    public static void main(String[] args) {

        Function<String, String> upperCase = s -> s.toUpperCase();
        System.out.println(upperCase.apply("lower"));

        Function<String, Integer> len = s -> s.length();
        System.out.println(len.apply("Hello"));

        Function<Integer, Integer> sum = n -> n+10;
        System.out.println(sum.apply(12));

        Function<Student, Integer> percentage = m -> {     //m contains Student
            System.out.println("Percentage of " + m.getName() + " is ");
            Integer p = (m.getPhysiscsMarks()*100) / 100;
            System.out.println(p);
            return p;
        };
        System.out.println( percentage.apply(new Student("Ammu", 12, 97)));
    }
}
