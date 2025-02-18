package com.sree.collections.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Countries {


    public static void main(String[] args) {
        List<String> places = new ArrayList<>();
        places.add("USA");
        places.add("Dubai");
        places.add("Australia");

        Collections.sort(places, new CustomComparator());

        System.out.println(places.toString());
    }
}
