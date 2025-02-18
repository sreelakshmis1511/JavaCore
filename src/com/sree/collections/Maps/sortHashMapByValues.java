package com.sree.collections.Maps;

import java.util.*;

public class sortHashMapByValues {

    public static void main(String[] args) {

        Map<Integer, String> names = new HashMap<>();
        names.put(5, "Kabir");
        names.put(6, "Parul");
        names.put(3,"Abhi");

        List<Map.Entry<Integer, String>> namesList = new ArrayList<>(names.entrySet());  //MAP TO LIST
        Collections.sort(namesList, new ComaparatorNames());            //sort using custom comparator

        for(Map.Entry<Integer, String> n : namesList){
            System.out.println(n);
        }


    }
}
