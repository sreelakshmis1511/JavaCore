package com.sree.collections.Maps;

import java.util.HashMap;
import java.util.Map;

public class getOrDefault {


    public static void main(String[] args) {
        Map<String, Integer> s = new HashMap<>();
        s.put("Apple", 3);
        s.put("Orange", 5);

        System.out.println( s.getOrDefault("Apple", 0));
        System.out.println( s.getOrDefault("Kiwi", 0));
        //Gets the value corresponding to the key; if not returns the default value given
    }
}
