package com.company;

public class ArrayRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,8,9,12};
        System.out.println(sort(arr));
        System.out.println(sorted(arr,0));

    }
    static boolean sort(int[] arr){
        int start = 0;
        int end = arr.length-1;
        return helper(start,end,arr);
    }
    static boolean helper(int start,int end,int[] arr){
        if(start == end){
            return true;
        }
        if(arr[start] < arr[start+1]){
            start += 1;
        }
        else{
            return false;
        }
        return helper(start,end,arr);
    }

    // another way tho do by using bitwise operator
    static  boolean sorted(int[] arr,int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && sorted(arr,index+1);
    }
}
