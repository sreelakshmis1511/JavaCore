package com.sree.java8Features.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class stream1 {
//A Java Stream cannot be reused once it is consumed.
//IllegalStateException is thrown because a Java Stream can be consumed only once.
// If you need to reuse the stream, create a new stream each time:

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ammu");
        names.add("Appu");
        names.add("Sandhya");

        Stream<String> namess = names.stream();
        namess.forEach(e -> System.out.println("using lambda " + e));
        //namess.forEach(System.out::println);    //IllegalStateException is thrown because a Java Stream can be consumed only once.

        names.stream().forEach(e -> System.out.println("using lambda " + e));
        names.stream().forEach(System.out::println);      // works fine because this is a new stream

        Stream<Integer> nums = Stream.of(23,45,11,67);
        nums.parallel(); //To convert a stream to parallelStream
    }
}
