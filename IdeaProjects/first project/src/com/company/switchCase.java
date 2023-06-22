package com.company;
import java.util.Scanner;

public class switchCase {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        String b = a.next();
        switch(b){
            case "Mango":
                int c = a.nextInt();
                System.out.println(c);
                System.out.println("Mango");
                break;
            case "Apple":
                System.out.println("apple");
                break;
            default:
                System.out.println("invalid enter");
        }
    }
}
