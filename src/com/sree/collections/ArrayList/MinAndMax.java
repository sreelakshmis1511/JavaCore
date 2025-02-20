package com.sree.collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinAndMax {

    public static void main(String[] args) {

        List<Integer> nums = List.of(23,13,14,56,67);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;



//        System.out.println( Collections.min(nums) );
//        System.out.println(Collections.max(nums));

        for(int n : nums){
            if(n<min){
                min = n; //13

            }
           else if(n > max){
                max = n; //67
            }

        }

        System.out.println(" max is "+  max + " min is " + min);

    }
}
