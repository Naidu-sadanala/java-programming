package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Question7 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,3,3,4,4,5,6,6,6,77,77,7};
         ArrayList<Integer> ans=WithoutDuplicates(arr);
        System.out.println(ans);
    }
    static ArrayList<Integer> WithoutDuplicates(int[] arr){
        int a = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<a;i++){
            if(i==0){
                list.add(arr[i]);
            }else if(arr[i-1] != arr[i]) {
                list.add(arr[i]);
            }
        }
        return list;
    }
}
