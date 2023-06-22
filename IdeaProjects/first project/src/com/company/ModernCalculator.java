package com.company;
import java.util.Scanner;
public class ModernCalculator {
    public static void main(String[] args){
        Scanner cal = new Scanner(System.in);
        while(true){
            System.out.print("enter the number:");
            int num1 = cal.nextInt();
            System.out.print("enter the operand:");
            char str = cal.next().trim().charAt(0);
            System.out.print("enter number :");
            int num2 = cal.nextInt();
            switch(str){
                case '+':
                    int num3 = num1 + num2;
                    System.out.println(num3);
                    System.out.println("want to include another number");
                    System.out.println("yes, press y");
                    char str2 = cal.next().trim().charAt(0);
                    if(str2 == 'Y' || str2 == 'y'){
                        System.out.println("enter how numbers you want to add:");
                        int input = cal.nextInt();
                        int temp = num3;
                        for(int i=1; i <= input ; i++) {
                            System.out.println("enter number:");
                            int num4 = cal.nextInt();
                            int num5 = temp + num4;
                            temp = num5;
                            System.out.println(num5);
                        }
                        System.out.println("your calculation has done");
                    }
                    else{
                        System.out.println("program terminated");
                    }
                    break;
                case '-':
                    System.out.println(num1 - num2);
                    break;
                case '*':
                    System.out.println(num1 * num2);
                    break;
                case '/':
                    if (num2 != 0){
                        System.out.println(num1 / num2);}
                    else{
                        System.out.println("denominator is zero");
                    }
                    break;
                case '%':
                    if (num2 != 0){
                        System.out.println(num1 % num2);}
                    else{
                        System.out.println("denominator is zero");
                    }
                    break;
            }


        }
    }
}
