package com.sree.Arrays;

import java.util.Arrays;

public class ArrayCopy {

    public static void main(String[] args) {

        int[] oldArray = {2,5,7,9};
        int[] newArray = new int[oldArray.length + 4];

//        for(int i=0; i<oldArray.length; i++){
//            newArray[i]=oldArray[i];                                          //method 1
//        }

 //       System.arraycopy(oldArray,0,newArray, 0, oldArray.length);           //method 2


        int[] newArray1 = Arrays.copyOf(oldArray, oldArray.length);           //method 3

        for(int i=0; i<newArray1.length; i++){
            System.out.println(newArray1[i]);
        }

    }


}
