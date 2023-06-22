package com.Questions;

public class MatrixMul {
    public static void main(String[] args){
        int[][] arr1 = {
                {1,2,3},{4,5,6},{7,8,9}
        };
        int[][] arr2 = {
                {1,2,3},{4,5,6},{7,8,9}
        };
        int[][] arr3 = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr3[i][j] = 0;
                for (int k = 0; k < arr1[i].length; k++) {
                    arr3[i][j] += (arr1[i][k] * arr2[k][j]);
                }
            }

        }
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
