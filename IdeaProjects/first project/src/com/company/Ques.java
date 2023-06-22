package com.company;

import java.util.Arrays;
class HelloWorld {
    public static void main(String[] args) {
        String s = "naidu sadanala";
        //System.out.println(s.replaceFirst("naidu","nai"));
        // System.out.println(Arrays.toString(String[] ss= new s.split(" ")));
        String[] ss = s.split(" ");
        String sss ="";
        for(String i : ss){
            sss = sss + i.substring(0,1).toUpperCase() + i.substring(1)+ " ";
        }

        System.out.println(sss.trim());


    }
}
