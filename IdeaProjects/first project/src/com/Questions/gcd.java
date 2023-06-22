package com.Questions;

public class gcd {
    public static void main(String[] args) {
        int[] arr = {4,6,8,10};
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = gcd(result,arr[i]);
        }
        System.out.println(result);

    }
    static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd(b%a , a);
    }
}
