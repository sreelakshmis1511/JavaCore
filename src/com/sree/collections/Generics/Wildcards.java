package com.sree.collections.Generics;

import java.util.List;

public class Wildcards {


    public static void main(String[] args) {

        List<String> names = List.of("Sree", "Ammu");
        List<Object> nums = List.of(1,3,5);
        printArray(names);

    }


    public static void printArray(List<?> names){   //Unbounded wildcards - generic list
        System.out.println(names);
    }


    public static void printArray1(List<? super Integer> nums){   //Lower Bounded wildcards - generic list
        System.out.println(nums);                                  // Anything above Integer can be passed, like Number, Object
    }

    public static void printArray2(List<? extends Object> nums){   //Upper Bounded wildcards - generic list
        System.out.println(nums);                                  // Anything child of Object Integer can be passed
    }


}
