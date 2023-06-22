package com.Questions;
import java.util.*;
public class Question15 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the odd number :");
            int loop = sc.nextInt();
            int temp = loop;
            for (int i = 0; i < temp-2; i++) {
                int high = temp;
                int low = 1;
                for (int j = 0; j < i; j++) {
                    System.out.print("  ");
                }
                for (int j = 0; j < loop; j++) {
                    if(j%2==0){
                        System.out.print(high + " ");
                        high--;
                    }
                    else{
                        System.out.print(low + " ");
                        low++;
                    }
                }
                loop-=2;
                System.out.println();
            }
        }
}
