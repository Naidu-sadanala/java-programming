package com.company;

public class ceilingOfCharArray {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        char ceiling = 'f';
        char ans= search(arr,ceiling);
        System.out.println(ans);
    }
    static char search(char[] arr, char ceiling){
        int end= arr.length-1;
        int start=0;
        int mid = 0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(ceiling >arr[mid]){
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        // we can use if condition or directly we return the start
            // if(arr[mid]>ceiling){
            //     return arr[mid];
            //  }else{
             //     mid++;
              //    return arr[mid];
             // }
        int length=arr.length-1;
        return arr[start % length];
        // if we want floor number we return end arr[end]

    }
}
