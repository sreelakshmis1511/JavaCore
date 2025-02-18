package com.sree.collections.Generics;

import java.util.List;

public class GenericClassDemo {


    public static void main(String[] args) {

    GenericClass<Integer, String, Integer> stu = new GenericClass<>(12, "ammu", 49);

       int id =  stu.getId();           //no type casting required
       String name = stu.getName();  //no type casting required
       int marks = stu.getMark();  //no type casting required


      //  stu.setId("sree");  //gives compilationerror if wrong value is given
    }

}
