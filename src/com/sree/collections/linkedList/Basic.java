package com.sree.collections.linkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Basic {

    public static void main(String[] args) {

        List<Integer> nums = new LinkedList<>();
        nums.add(12);
        nums.add(25);
        nums.add(56);
        nums.add(11);
        nums.add(9);

        Collections.sort(nums);
        System.out.println(nums);


        List<String> obj = Collections.synchronizedList(new ArrayList<>()); //To synchronize arrayList
        CopyOnWriteArrayList objs = new CopyOnWriteArrayList<>(); ////To synchronize arrayList
    }
}
