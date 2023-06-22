package com.company;

public class prime {
    public static void main(String[] args) {
        int n = 20;
        boolean[] arr = new boolean[n+1];
        sieve(n, arr);
    }
    // every boolean array intially have its value as false in it
    static void sieve(int n,boolean[] arr){
        for (int i = 2; i*i <=n ; i++) {
            for (int j = i*2; j <= n ; j+=i) {
                if(!arr[j]){
                    arr[j] = true;
                }
            }

        }
        for (int i = 2; i < n; i++) {
            if(!arr[i]){
                System.out.print(i + " ");
            }
        }
    }
}
