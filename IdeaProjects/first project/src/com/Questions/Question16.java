package com.Questions;
import java.util.*;
public class Question16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the string:");
        String str = in.next();
        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9' || ch == '0') {
                for (int j = i; j < str.length(); j++) {
                    ch = str.charAt(j);
                    if (ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9' || ch == '0') {
                        int num = Character.getNumericValue(ch);
                        sum = sum * 10 + num;
                        i++;
                    } else {
                        break;
                    }

                }
                arr.add(sum);
                sum = 0;
            }

        }
        System.out.println(arr);
    }
}
