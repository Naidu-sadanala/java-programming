package com.Questions;
import java.util.*;
public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int num = sc.nextInt();
        int temp = 65;
        int even=0,odd=num-1;
        char ch[][] = new char[num][num];
        for (int i = 0; i < num; i++) {
            if(i%2==0) {
                for (int j = 0; j < num; j++) {
                    ch[even][j] = (char) temp;
                    temp++;
                }
                even++;
            }
            else{
                for (int j = 0; j < num; j++) {
                    ch[odd][j] = (char) temp;
                    temp++;
                }
                odd--;
            }
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(ch[i][j] + " ");
            }
            System.out.println();
        }


    }
}
