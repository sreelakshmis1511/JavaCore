package com.sree.java8Features.Consumer;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

    public static void main(String[] args) {
        BiConsumer<String, String> st = (name1, name2) -> System.out.println("Hello " + name1 + " and " + name2);
        st.accept("Sree", "Dinu");
    }
}
