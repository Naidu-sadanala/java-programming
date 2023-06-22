package com.company;

public class fibnocci {
    public static void main(String args[]){
        int a = 0;
        int b = 1;
        for(int i = 0; i < 10 ; i ++){
            int c = b;
            b = b + a ;
            a = c ;
            System.out.println(b);
        }
    }
}
