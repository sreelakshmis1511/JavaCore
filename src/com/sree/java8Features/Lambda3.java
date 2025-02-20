package com.sree.java8Features;

//Develop a lambda expression that is capable of transforming a string into uppercase letters.

import java.util.ArrayList;
import java.util.List;

public class Lambda3 {

    public static void main(String[] args) {

        List<String> words = List.of("hello", "world", "java", "lambda");
        List<String> result = new ArrayList<>();

        FunctionalInterface3 f = (w) -> w.toUpperCase();  //Body and arguments if that method is created with implementation

        for(String word : words) {
            System.out.println(f.transform(word));

        }
    }

}
