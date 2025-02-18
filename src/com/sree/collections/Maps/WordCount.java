package com.sree.collections.Maps;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class WordCount {

  //  How will you count the frequency of each word in a list of strings?

    public static void main(String[] args) {

        List<String> obj = List.of("Kiwi","Apple", "Orange", "Kiwi", "Orange", "Kiwi", "Berry");

        Map<String, Integer> map = new LinkedHashMap<>();


        for(String key : obj){
          int value =  map.getOrDefault(key, 0) + 1;
          map.put(key, value);

        }

        for(Map.Entry<String, Integer> fr : map.entrySet()){
            System.out.println(fr.getKey() + ":" + fr.getValue());
        }

    }
}
