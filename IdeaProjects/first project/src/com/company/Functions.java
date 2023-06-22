package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Functions {
    public static void main(String []args){
       // for(int i = 0; i <= 2 ; i++){
      // System.out.println(sum1());
      // System.out.println(sum2( 20 , 30));
       int []arr = {1 ,22 , 31, 44};
        change(arr);
        System.out.println(Arrays.toString(arr));
    //}
    }
    static float sum1(){
        System.out.println("enter two numbers:");
        Scanner input = new Scanner(System.in);
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        float num3 = num1 + num2;
        return num3;

    }
    static int sum2(int a, int b){
        int sum = a + b;
        return sum;

    }
    static void change(int []nums){
        nums[1] = 99;
    }
}
