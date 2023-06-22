package com.Questions;
import java.util.*;
public class Question10 {
    public static void main(String[] args){
        /*int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("enter starting number:");
        int start = sc.nextInt();
        System.out.print("enter last number:");
        int end = sc.nextInt();
        for (int i =0;i<10;i++){
            System.out.print("enter array number at index "+ i +" :");
             arr[i] = sc.nextInt();
        }
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i = start;i<end;i++){
            ls.add(arr[i]);
        }
        System.out.println(ls);*/

        //patterns

        /*int num = 0;
        for (int i = 0; i < 10; i++) {
            for (int j =0;j<=i;j++) {
                if (num % 2 == 0) {
                    System.out.print(num);
                } else {
                    System.out.print("*");
                }
                num++;
            }
            System.out.println(" ");
        }*/

        //diamond

        int space = 3;
        for(int i =0;i < 6;i+=2){
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            space--;
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
        for(int i =6;i >= 0;i-=2){
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            space++;
            for (int j = i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println("");

        }

        //triangle
        /*int space=3;
        for(int i =0;i < 6;i+=2){
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            space--;
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }*/
    }
}
