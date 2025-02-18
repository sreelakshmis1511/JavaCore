package com.sree.collections.Maps;

import java.util.*;

public class FirstNonRepeatingCharacter {

    //You are given a string "swiss". Find the first non-repeating character.

    public static void main(String[] args) {
        String s = "swiss";


        Map<Character, Integer> map = new LinkedHashMap<>();
        int count = 1;

        for(int i=0; i<s.length(); i++){
            if (map.containsKey(s.charAt(i))){
                count ++;
                map.put(s.charAt(i), count);
            }
            else{
                map.put(s.charAt(i), count);
            }
        }

        for(Map.Entry<Character, Integer> mp : map.entrySet()){
            if(mp.getValue() == 1){
                System.out.println(mp.getKey());
                break;
            }
        }

    }
}
