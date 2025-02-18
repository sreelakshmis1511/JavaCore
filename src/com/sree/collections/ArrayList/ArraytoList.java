package com.sree.collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraytoList {

    public static void main(String[] args) {

        String[] names = {"Sree", "Abhi", "Ace"};

        List<String> nam = new ArrayList<>();
        Collections.addAll(nam, names);             //// adding elements of array to arrayList.

        System.out.println(nam.toString());

    }
}
