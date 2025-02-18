package com.sree.collections.General;

import java.util.*;

public class UnmodifiableCollection {

    //How to Make a Collection Read-Only in Java?
    public static void main(String[] args) {

        List<String> names = List.of("Am", "As");  //immutable list
        Set<Integer> nam =  Set.of(1,6,3);         //Immutable Set
        Map<Integer, String> school = Map.of(1,"ase",3,"lvb");  //Immutable map
        // Throws UnsupportedOperationException if try to add again

//-----------------------------------------------------------------------------------------------------------------------------
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        List<String> unmodifiable = Collections.unmodifiableList(list);  //// Both lists share the same memory reference for elements
        System.out.println(unmodifiable);

        //Collections.unmodifiableSet()
        //Collections.unmodifiableMap()
    }
}
