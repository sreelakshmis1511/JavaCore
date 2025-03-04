package com.sree.java8Features.Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class arrayStream {

    public static void main(String[] args) {

        String[] fruits = {"aPPLE", "Mango"};
        Stream<String> frut = Arrays.stream(fruits);  //Convert array to streams
    }
}
