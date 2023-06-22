package com;

import com.company.Array;

import java.util.Arrays;

public class FirstLastIndex {
    //first and last index of the same number in the array
    public static void main(String[] args) {
        int[] arr={1,2,3,7,7,7,8,8,10};
        int target=7;
        int[] ans={-1,-1};
        ans[0] = search(arr,target,true);
        if(ans[0]!=-1){
        ans[1] = search(arr,target,false);}
        System.out.println(Arrays.toString(ans));
    }
    static int search(int[] arr,int target,boolean Startindex){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                 ans=mid;
                 if(Startindex){
                     end=mid-1;
                 }
                 else{
                     start=mid+1;
                 }

            }
        }
        return ans;
    }
}
