package com.company;


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner op = new Scanner(System.in);
        while (true){
            System.out.println("ENTER THE OPERATOR:");
            char a = op.next().trim().charAt(0);
            if(a == '+' || a == '-' || a == '*' || a == '/' || a == '%'){
                System.out.println("Enter first number:");
                float num1 = op.nextFloat();
                System.out.println("enter second number:");
                var num2 = op.nextFloat();
                if(a == '+'){
                    System.out.println(num1 + num2);

                }
                else if(a == '-'){
                    System.out.println(num1 - num2);
                }
                else if(a == '*'){
                    System.out.println(num1 * num2);
                }
                else if(a == '/'){
                    if(num2 != 0){
                        float num3 = num1 / num2 ;
                        System.out.println(num3);
                    }
                }
                else if(a == '%'){
                    if(num2 != 0){
                        System.out.println(num1 % num2);
                    }
                }
            }
            else if( a == 'x' || a == 'x'){
                System.out.println("program terminated");
            }
            else{
                System.out.println("invalid input");
            }
        }

    }
}
