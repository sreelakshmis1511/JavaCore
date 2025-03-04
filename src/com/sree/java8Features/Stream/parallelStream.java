package com.sree.java8Features.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class parallelStream {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Ammu");
        names.add("Appu");
        names.add("Sandhya");

       Stream<String> name = names.parallelStream();
       name.forEach(System.out::println); //order is not guaranteed since it is processed parallely
    }
}
