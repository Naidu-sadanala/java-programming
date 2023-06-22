package com.company;

public class XorInArray {
    public static void main(String[] args) {
//        int[] arr = {2, 3, 7, 4, 2, 6, 5};
        int[] arr = {2,2};
        System.out.println(ans(arr));
    }
    private static int ans(int[] arr){
       int unique = 0;
       for(int n : arr){
           unique ^= n;
       }
       return unique;
    }
}

