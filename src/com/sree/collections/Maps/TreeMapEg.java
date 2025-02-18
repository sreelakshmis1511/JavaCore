package com.sree.collections.Maps;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEg {  //SORTS on the basis if KEY - ASCENDING ORDER


    public static void main(String[] args) {
        Map<String, Integer> places = new TreeMap<>();   //ASCENDING ORDER OUTPUT
        places.put("Blr", 3);
        places.put("Aluva", 2);



        for(Map.Entry<String, Integer> placeMap : places.entrySet()){
            System.out.println(placeMap.getKey() + " " + placeMap.getValue() );
        }
    }

}
