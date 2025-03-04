package com.sree.java8Features.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class flterEvenNumbers {
    //Write a Java program to filter even numbers from a List<Integer> using Predicate<Integer>.

    public static void main(String[] args) {
        List<Integer> nums = List.of(23,34,45,12,13,67,88);
        List<Integer> evenList1 = new ArrayList<>();
        List<Integer> evenList2 = new ArrayList<>();

        Predicate<Integer> isEven = n -> n%2==0;

        //METHOD1
        for(int n : nums){
            if(isEven.test(n)){
                evenList1.add(n);
            }
        }

        //METHOD2

        evenList2 = nums.stream().filter(isEven).collect(Collectors.toList());
        System.out.println(evenList2.toString());
    }
}
