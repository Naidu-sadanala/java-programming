package com.company;

import java.util.Arrays;

public class VarArgs {
    public static void main(String []args){
        fun(1 , 2 ,3 , 45, 56,99);
    }

    private static void fun(int ...v) {//in the place we can use any letter
        //it is used for mutliple inputs of any types
        System.out.println(Arrays.toString(v));
    }
}
