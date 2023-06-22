package com.company;
import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] a = new int[5];
        a = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(sort(a)));
    }
    static int[] sort(int[] arr){
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return arr;
    }
}
