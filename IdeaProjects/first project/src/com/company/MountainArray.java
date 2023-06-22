package com.company;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr={0,2,3,8,9,10,7,5,4,1};
        System.out.println(search(arr));
    }
    static int search(int[] arr){
        int start=0;int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
                end=mid;
            else
                start=mid+1;
        }
        return start;
    }
}
