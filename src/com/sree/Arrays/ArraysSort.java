package com.sree.Arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysSort {

    public static void main(String[] args) {

        int[] num = {4,5,1,2,3};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        int[] largeArray = new int[100];
        Random r = new Random();
        for(int i=0; i<largeArray.length; i++){
            largeArray[i]    = r.nextInt(100);
        }
        Arrays.parallelSort(largeArray);
        System.out.println(Arrays.toString(largeArray));

    }
}
