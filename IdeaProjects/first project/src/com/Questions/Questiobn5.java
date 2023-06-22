package com.Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Questiobn5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        int []board = new int[in];
        int []stu=new int[in];
        for(int i =0;i < in; i++){
            stu[i] = input.nextInt();
            board[i]= i+1;
        }
        int count = 0;
        if(Arrays.equals(board,stu)){
            System.out.println(count);
        }else {
            int temp;
            while (true) {
                for (int i = 0; i < in; i++) {
                    temp = stu[stu.length/2];
                    if(i > 0  && i < stu.length/2){
                        stu[i+1] =stu[i];
                    }
                    else{
                        stu[i+1] =stu[i];
                    }

                }
                count ++;
            }
        }
    }
}
