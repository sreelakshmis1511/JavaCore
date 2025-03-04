package com.sree.java8Features.Consumer;

import java.util.function.Consumer;

public class ConsumerDemo {
//Input and No output is returned
    public static void main(String[] args) {

        Consumer<String> c = s -> System.out.println("Hello Consumer  " + s);
        c.accept("Sree");
    }
}
