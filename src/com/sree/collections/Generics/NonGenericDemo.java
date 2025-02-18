package com.sree.collections.Generics;

public class NonGenericDemo {

    public static void main(String[] args) {
        NonGenericClass non = new NonGenericClass(1, "sree");

        int id = (Integer) non.getId();   //Explicit Typecasting is required
        String name = (String) non.getName();   //Explicit Typecasting is required


        non.setId("sree");   //runtimeerror - no type safety


    }
}
