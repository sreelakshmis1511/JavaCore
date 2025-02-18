package com.sree.Arrays;

public class Arrays2D {

    public static void main(String[] args) {
        //int[][] matrix = new int[2][3];
        int[][] matrix = {
                {5,5,5,4},
                {5,5,5,4}
        };
        System.out.println("Length is "+ matrix.length);
        int sum = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j< matrix[i].length; j++){
              sum = sum +  matrix[i][j];
            }
        }
        System.out.println("Sum is "+ sum);
    }
}
