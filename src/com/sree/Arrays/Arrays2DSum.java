package com.sree.Arrays;

public class Arrays2DSum {

    public static void main(String[] args) {

        int[][] matrix1 = {
                {6,5,5,4},
                {6,5,5,4}
        };

        int[][] matrix2 = {
                {1,2,4,4},
                {3,7,1,2}
        };

        int[][] matrix3 = new int[2][4];

        int a,b;
        int sum = 0;
        if(matrix1.length == matrix2.length){
            for(int i=0; i<matrix1.length; i++){
                for(int j=0; j< matrix1[i].length; j++){
                    matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
                    System.out.print(matrix3[i][j] + " ");
                }
                System.out.print("\n");
            }
        }


        System.out.println("Sum is "+ sum);
    }
}
