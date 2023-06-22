package com.company;
import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("enter the number :");
         int input1 = input.nextInt();
         int temp=input1;
         int sum=0;
         while(input1>0){
             int a = input1%10;
             sum=a+(sum*10);
             input1=input1/10;
         }
         if(temp==sum){
             System.out.println("yes");
         }
         else
             System.out.println("no");
    }
}
