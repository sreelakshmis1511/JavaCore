package com.sree.collections.Comparator;

import java.util.Comparator;

public class CustomComparator implements Comparator<String>{ //to comapre String objects


    @Override
    public int compare(String o1, String o2) {

        char char1 = o1.charAt(2);
        char char2 = o2.charAt(2);
        return Character.compare(char1,char2);
    }

}
