package com.company;

import java.util.Arrays;

public class BubbleSortOwn {
        public static void main(String[] args) {
            int[] a = new int[5];
            a = new int[]{8, 9, 3, 2,6};
            System.out.println(Arrays.toString(sort(a)));
        }
        static int[] sort(int[] arr){
            int a = arr.length-1;
            while(a>0) {
                for (int j = 1; j <= a; j++) {
                    if (arr[j - 1] > arr[j]) {
                        int temp = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = temp;
                    }
                }
                a--;
            }
            return arr;
        }
    }


