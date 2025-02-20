package com.sree.collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraytoList {

    public static void main(String[] args) {

        String[] names = {"Sree", "Abhi", "Ace"};
//METHOD - 1
        List<String> nam = new ArrayList<>();
        Collections.addAll(nam, names);             //// adding elements of array to arrayList.

//METHOD -2
        List<String> nams = Arrays.asList(names);

        System.out.println(nam.toString());

    }
}
