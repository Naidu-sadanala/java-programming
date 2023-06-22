package com.company;

import java.util.Arrays;
public class Question9 {
    public static void main(String[] args) {
        int[] nums1={1,3};
        int[] nums2={2};
        double ans = findMedianSortedArrays(nums1,nums2);
        System.out.println(ans);
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int[] arr = new int[len];
        int j = nums1.length;
        int i = nums2.length;
        System.arraycopy(nums1,0,arr,0,j);
        System.arraycopy(nums2,0,arr,j,i);
        Arrays.sort(arr);
        if(arr.length % 2 == 0){
            int mid = arr.length/2;
            int sum = arr[mid] + arr[mid-1];
            float sum1 = sum /2f;
            return sum1;
        }else {
            int mid = arr.length /2;
            int a = (int) Math.floor(mid);
            return arr[a];
        }
    }

}

