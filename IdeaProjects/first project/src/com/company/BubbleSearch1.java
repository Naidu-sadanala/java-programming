package com.company;

// ceiling program
public class BubbleSearch1 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18,205,456};
        int ceiling = 15;
        int ans= search(arr,ceiling);
        System.out.println(ans);
    }
    static int search(int[] arr, int ceiling){
        int end= arr.length-1;
        int start=0;
        int mid = 0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(ceiling >arr[mid]){
                start=mid+1;
            }else if(ceiling <arr[mid]){
                end=mid-1;
            }else return arr[mid];
        }
  // we can use if condition or directly we return the start
  //      if(arr[mid]>ceiling){
  //          return arr[mid];
  //      }else{
  //          mid++;
  //          return arr[mid];
  //      }
        return arr[start];
    // if we want floor number we return end arr[end]

    }
}
