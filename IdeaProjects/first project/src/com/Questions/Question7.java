package com.Questions;
import java.util.*;
public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < num3; i++) {
            if(num1 %2==0){
                list1.add(num1);
            }
            else{
                list2.add(num1);
            }
            int temp = num2;
            num2 = num1 + num2;
            num1 = temp;

        }
        System.out.println(list1);
        System.out.println(list2);
    }

}
