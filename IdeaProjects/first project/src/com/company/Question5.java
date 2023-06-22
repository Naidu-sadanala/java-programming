package com.company;

public class Question5 {
    public static void main(String[] args) {
        System.out.println(pin(4413,5816,1780,25));
    }
    static int pin(int input1,int input2,int input3,int input){
        int a = 10;
        int lar2=0;
        int lar3=0;
        while(input1>0 && input2>0 && input3>0){
            int b = input1%10;
            int c = input2%10;
            int d = input3%10;
            if(b<a){
                a=b;
            }
            if(c>lar2){
                lar2=c;
            }
            if(d>lar3){
                lar3=d;
            }
            input1=input1/10;
            input2=input2/10;
            input3=input3/10;
        }
       int pin = (a * lar2 * lar3) + input;
        return pin;
    }
}
