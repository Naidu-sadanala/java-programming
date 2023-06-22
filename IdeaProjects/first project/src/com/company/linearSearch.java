package com.company;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number :");
        int target = in.nextInt();
        if(arr.length == 0){
            System.out.println("no data found");
        }
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]){
                a++;
                int j = i;
                System.out.println(i);
        }
        }
        if (a == 0){
            System.out.println("element not found");
        }

    }
}
