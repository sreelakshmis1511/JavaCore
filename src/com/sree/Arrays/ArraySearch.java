package com.sree.Arrays;

import java.util.Arrays;

public class ArraySearch {

    public static void main(String[] args) {
        int[] ar = {3,2,1,45,6};

        Arrays.sort(ar);
        int e = Arrays.binarySearch(ar, 45);
        System.out.println("Index is " + e);
    }
}
