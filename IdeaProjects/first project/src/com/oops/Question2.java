package com.oops;

import java.util.ArrayList;

public class Question2 {
    public static void main(String[] args) {
        int[] arr = {3,6,18,11,12,67,66};
        helper(arr);
    }
    static void helper(int arr[]){
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                if(arr[i] % 3 == 0){
                    ans.add(arr[i]);
                }
            }
        }
        System.out.println(ans);
    }
}
