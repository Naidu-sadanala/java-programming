package com.company;

import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
         Scanner a = new Scanner(System.in);
         System.out.print("enter salary:");
         int b = a.nextInt();
         // conditiom statmets
        if(b >= 25000){
            b = b + 2000;
            System.out.println("high emp salary  is :" + b);
        }
        else if(b >= 15000){
            //we can use down statment for incresing same value
            b += 1000;
            System.out.println("medium emp salary is :" + b);
        }
        else {
            b = b + 500;
            System.out.println("lower emp salary is :" + b);
        }
    }
}
