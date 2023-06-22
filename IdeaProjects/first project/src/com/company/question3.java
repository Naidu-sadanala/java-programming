package com.company;

public class question3 {
    public static void main(String[] args) {
        int[] nums1 = {1 ,3};
        int[] nums2 = {2,4};
        System.out.println(median(nums1,nums2));
    }
    static float median(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int k = m + n;
        int[] nums3= new int[k];
        for(int i = 0; i < k; i++){
            if(i < n){
                nums3[i]=nums1[i];
            }
            else{
                nums3[i]=nums2[i-n];
            }
        }
        int a = nums3.length;
        for (int i = 0; i < nums3.length; i++) {
            for (int j = 1; j < nums3.length - i; j++) {
                if (nums3[j - 1] > nums3[j]) {
                    int temp = nums3[j];
                    nums3[j] = nums3[j - 1];
                    nums3[j - 1] = temp;

                }
            }
        }
        if(a%2==1){
            int b = a/2;
            return nums3[b];
        }
        else{
            int b = a/2;
            float c = (nums3[b] + nums3[b-1]) / 2f;
            return c;
        }
    }
}
