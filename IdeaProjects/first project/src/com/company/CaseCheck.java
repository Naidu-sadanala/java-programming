package com.company;
import java.util.Scanner;

public class CaseCheck {
    public static void main(String []args){
        Scanner ch = new Scanner(System.in);
        char a = ch.next().trim().charAt(0);
        if( a >= 'a' && a <= 'b'){
            System.out.println("lower case");
        }
        else{
            System.out.println("uppper case");
        }
    }
}
