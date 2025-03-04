package com.sree.collections.ArrayList;

import java.util.*;

public class sort {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(26);
        list.add(66);
        sortArrayList(list);
    }

    public static void sortArrayList(ArrayList<Integer> list) { // Time complexity is O(n^2)
        Deque<Integer> d = new ArrayDeque<>();
        int sizee = list.size();
        for(int i=0; i<sizee;i++) {
            d.add(Collections.min(list));
            list.remove(Collections.min(list));
        }
        System.out.println("sorted array is ");
        for(int dq : d){
            System.out.print(dq + " ");
        }
    }
}
