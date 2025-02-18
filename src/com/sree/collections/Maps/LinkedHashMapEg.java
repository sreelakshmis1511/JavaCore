package com.sree.collections.Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEg {


    public static void main(String[] args) {
        Map<String, Integer> places = new LinkedHashMap<>(); //Maintains order of insertion
        places.put("Aluva", 2);
        places.put("Blr", 3);


        for(Map.Entry<String, Integer> placeMap : places.entrySet()){
            System.out.println(placeMap.getKey() + " " + placeMap.getValue() );
        }
    }

}
