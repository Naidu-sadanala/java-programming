package com.company;

public class RevRecursion {
    public static void main(String[] args) {
        System.out.println(rev(1506));
    }
    static long rev(int n){
        if(n % 10 == n){
            return n;
        }
        int count =0 ;
        int m = n;
        while(m>0){
            m = m/10;
            count ++;
        }
        // here we can also another formula for getting the digits of the number
        // instead of while loop we can use log
        //int digit = (int)Math.log10(n)+1;
        //double a = Math.pow(10,(digit-1));
        double a = Math.pow(10,(count-1));
        return Math.round(((n % 10)*a) + rev(n/10));
    }
}
