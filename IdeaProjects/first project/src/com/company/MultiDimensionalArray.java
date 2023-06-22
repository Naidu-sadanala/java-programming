package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String []args){
        //direct assigning
        int[][] arr = new int[3][3];
        Scanner in = new Scanner(System.in);
        //in two dimensional array no need to specify columns
       // int[][] arr = {
       //         {1, 2, 3},
       //         {4, 5, 6},
       //        {7, 8, 9}
        // };
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++){
                arr[i][j] = in.nextInt();
            }
        }
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++){
               System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
