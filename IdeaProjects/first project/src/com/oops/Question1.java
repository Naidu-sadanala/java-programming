package com.oops;

import java.util.ArrayList;

public class Question1 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3,4,5,5};
        helper(arr);
    }
    static void helper(int[] arr){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i =0; i<arr.length; i++){
            if(i==0){
                ans.add(arr[i]);
            }else if(arr[i-1]<arr[i]){
                ans.add(arr[i]);
            }
        }
        System.out.println(ans.size());
    }
}
