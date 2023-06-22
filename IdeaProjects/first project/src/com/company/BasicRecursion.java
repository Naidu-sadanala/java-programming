package com.company;

public class BasicRecursion {
    public static void main(String[] args) {
        int n = 10;
       // Recursion(n);
        System.out.println(Factorial(5));
        System.out.println(SumOfDigits(305));
    }
    static void Recursion(int n){
        System.out.println(n);
        if(n==1){
            return;
        }
        Recursion(n-1);
    }
    static long Factorial(int n){
        if(n==1) {
            return n;
        }
        return Factorial(n-1) * n;
    }
    static int SumOfDigits(int n){
        if(n == 0){
            return n;
        }
        return (n % 10) + SumOfDigits(n/10);
    }
}
