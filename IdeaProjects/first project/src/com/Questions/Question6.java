package com.Questions;

import java.util.ArrayList;
import java.util.*;

public class Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int[][] arr= new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = input.nextInt();
            }
            
        }
//        int[][] arr = {{1,0,0,1,1},
//                {0,1,1,0,1},
//                {1,1,1,1,1},
//                {1,0,0,1,1}};
        ArrayList<Integer> li = new ArrayList<>();
//        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if(arr[i][j] == 1){
                    count++;
                    try{
                    if(arr[i][j+1] == 0){
                        li.add(count);
                        count = 0;
                    }}
                    catch (Exception e){
                        li.add(count);
                    }
                }
            }
        }
        System.out.println(Collections.max(li));
    }
}
