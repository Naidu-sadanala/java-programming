package com.company;

import java.util.Arrays;

import static com.company.Functions.sum1;

public class Question {
    public static void main(String[] args) {
        String name = "1,2,3,4,5,6,7,8,9";
        int[] arr = naidu(name);
        System.out.println(Arrays.toString(arr));
        int c = sadanala(name,arr);
        System.out.println(c);
        System.out.println(arr[0]+c);


    }
    static int[] naidu(String name){
        int start = 0;
        int end=0;
        int ans = 0;
        for (int i = 0; i < name.length(); i+=2) {
            char a = name.trim().charAt(i);
            if(a == '4'){
                start = i;
            }
            if(a == '7'){
                end = i;
            }
        }
        for (int i = start; i <= end ; i+=2) {
            char a = name.trim().charAt(i);
            int b = Character.getNumericValue(a);
            ans = (ans*10) + b;
        }
        return new int[] {ans,start,end};
    }
    static int sadanala(String name,int[] arr){
        int ans=0;
        for (int i = 0; i < name.length(); i+=2) {
            char a = name.trim().charAt(i);
            int b = Character.getNumericValue(a);
            if(b==4){
                int c = arr[2]-arr[1];
                i = i+c;
            }
            else{
                ans = ans + b;
            }

        }
        return  ans;
    }
}
