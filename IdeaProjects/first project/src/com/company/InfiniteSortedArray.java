package com.company;

public class InfiniteSortedArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,9,200,210,411,512,613,714,915};
        int target=200;
        int ans=search(arr,target);
        System.out.println(ans);
    }
    static int search(int[] arr,int target) {
        int start=0;
        int end=1;
        while(true) {
            if(target<=arr[end]) {
                while (start <= end) {
                   int  mid = start + (end - start) / 2;
                    if (target >arr[mid]) {
                        start = mid + 1;
                    } else if (target < arr[mid]) {
                        end = mid - 1;
                    } else {
                        return mid;
                    }
                }
            }
            else {
                int temp=end+1;
                end=end+(end-start+1)*2;
                start=temp;
                //beyond these three commands we can use
                //start=end+1
                //end=end*2 or end=end+5/6/7/8
                //being this is an infinite array we can increase the end with our wish
            }
        }
    }
}
