package com.sree.Arrays;

import java.util.Arrays;

public class JaggedArray {

    public static void main(String[] args) {

        int[][] j = new int[3][];
        j[0] =  new int[]{1,2,3,4};
        j[1] = new int[]{5};
        j[2] = new int[]{9,3};

        System.out.println(Arrays.deepToString(j));
    }


}
