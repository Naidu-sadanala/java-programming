package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
       // System.out.print("give first number :");
        int b = a.nextInt();
      //  System.out.print("give second  number :");
        int c = a.nextInt();
      //  System.out.print("give third number :");
        int d = a.nextInt();
       /* if(b > c && b > d){
            System.out.println("greatest number is:" + b);
        }
        else if(c > b && c > d){
            System.out.println("the greatest is:" + c);
        }
        else{
            System.out.println("the greatest number is:" + d);
        }*/
        int nai = Math.max(d, Math.max(b, c));
        System.out.println(nai);
    }
}
