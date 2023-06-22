package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the array size:");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("rotational size:");
        int d = input.nextInt();
        int[] ans = helper(arr,d);
        System.out.println(Arrays.toString(ans));

    }
    static int[] helper(int[] arr, int d){
        int[] list = new int[arr.length];
        int j =0;
        for (int i = d; i < arr.length; i++) {
            list[j] = arr[i];
            j++;
        }
        for(int i = 0; i < d;i++){
            list[j] = arr[i];
            j++;
        }
        return list;
    }

}
