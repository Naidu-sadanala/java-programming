package com.Questions;
import java.util.*;
public class Question20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the word:");
        String str = sc.next();
        if (str.equals(str.toUpperCase())){
            System.out.println(true);
        }
        else if(str.equals(str.toLowerCase())){
            System.out.println(true);
        }
        else if (Character.isUpperCase(str.charAt(0))){
            int count = 0;
            for (int i = 1; i < str.length(); i++) {
                char a = str.charAt(i);
                if(Character.isUpperCase(a)){
                    count++;
                    break;
                }
            }
            if(count>0){
                System.out.println(false);
            }
            else{
                System.out.println(true);
            }
        }
        else{
            System.out.println(false);
        }
    }
}
