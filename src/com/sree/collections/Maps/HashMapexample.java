package com.sree.collections.Maps;

import java.util.*;

public class HashMapexample {

    public static void main(String[] args) {

        Map<String, String> cities = new HashMap<>();  //doesnt maintain insertion order
        cities.put("Kerala", "Kochi");
        cities.put("Karnataka", "Bengaluru");

        TreeMap<String, String> city = new TreeMap<>(cities);  //To SORT on the basis of KEY
       Set<String> cityy = city.keySet();
        for(String c : cityy){
            System.out.println( "TreeMap" + city.get(c));
        }


//Iteration APPROACH1 using keyset
        Set<String> keys = cities.keySet();
        for(String key : keys){
           String value = cities.get(key);
            System.out.println("approach1 " + key +" " + value);
        }


//Iteration APPROACH2 using entryset
        Set<Map.Entry<String, String>> entries = cities.entrySet();
        for(Map.Entry<String, String> entry : entries){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("approach2 " + key +" " + value);
        }

        for(Map.Entry<String, String> e : cities.entrySet()){
            System.out.println(   e.getKey()  + e.getValue());
        }


//Iteration APPROACH3 using values
       Collection<String> values =   cities.values();
        for(String value : values){
            System.out.println("approach3 " + value);
        }



    }


}
