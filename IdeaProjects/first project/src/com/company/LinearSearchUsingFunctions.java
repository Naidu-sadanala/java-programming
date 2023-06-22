package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchUsingFunctions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("enter the target:");
        int target ;
        target = in.nextInt();
        int ans = LinearSearch(arr, target);
        System.out.println(ans);
    }

    static int  LinearSearch(int[] arr, int element) {
        if (arr.length == 0) {
            System.out.println("no data found");
        }
        for (int i = 0; i < arr.length; i++) {
            if (element == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}


