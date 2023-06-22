package com.company;

import java.util.Scanner;

public class Multi2 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner in = new Scanner(System.in);
        for(int a = 0; a < arr.length; a++){
            for(int b = 0; b < arr[a].length; b++){
                arr[a][b] = in.nextInt();
            }
        }

        for(int a = 0; a < arr.length; a++){
            System.out.print("[");
            for(int b = 0; b < arr[a].length; b++){
               System.out.print(arr[a][b] + " ");
            }
            System.out.println("]");
        }
        System.out.println();
    }
}
