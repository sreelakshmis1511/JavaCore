package com.sree.java8Features.Stream;

import java.util.ArrayList;
import java.util.List;

public class map {
//map is an intermediate operation
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ammu");
        names.add("Appu");
        names.add("Sandhya");

        names.stream()
                .map( n -> n.toUpperCase())
                .map(n -> n.startsWith("A"))
                .forEach(System.out::println);
    }
}
