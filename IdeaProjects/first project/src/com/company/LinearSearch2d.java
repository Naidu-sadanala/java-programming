package com.company;

import java.util.Arrays;

public class LinearSearch2d {
    public static void main(String[] args) {
        int[][] arr = {
                {15, 20, 50, 16},
                {1, 4, 5},
                {1, 4},
                {22, 59, 36, 7}
        };
        int target = 7;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
        int[] maximum = max(arr);
        System.out.println(Arrays.toString(maximum));
    }
    static int[] search(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target){
                    return new int[]{i, j};
                }

            }

        }
        return new int[]{-1};
    }
    static int[] max(int[][] arr){
        int ma = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < ma) {
                    ma = arr[i][j];
                }
            }

        }
        return new int[]{ma};
    }
}
