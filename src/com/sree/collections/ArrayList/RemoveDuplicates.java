package com.sree.collections.ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {

    public static void main(String[] args) {
        List<String> names = List.of("Ammu", "Leo", "Leo");

        List<String> distinct = new ArrayList<>(new HashSet<>(names));
        System.out.println(distinct.toString());
    }
}
