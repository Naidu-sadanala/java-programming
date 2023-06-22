package com.Questions;
import java.util.*;
public class duplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,2,3,4,1,5,6,7,8};
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(arr);
        list.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1]==arr[i]){
                continue;
            }
            else{
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
}
