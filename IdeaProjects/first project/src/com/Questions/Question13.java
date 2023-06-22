package com.Questions;
import java.util.*;
public class Question13 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();
        int hcf=0,lcm=num5;
        //HCF for all the five numbers
        for (int i = 1; i < num1 || i<num2 || i<num3 || i<num4|| i<num5; i++) {
            if(num1%i==0 && num2%1==0 && num3%i==0 && num4%i==0 && num5%i==0){
                hcf=i;
            }
        }
        System.out.println("HCf of given numbers:"+ hcf );
        for (int i = 1; i < num1*num2*num3*num4*num5; i++){
            if(lcm%num5==0 && lcm%num4==0 &&lcm%num3==0 &&lcm%num2==0 && lcm%num1==0){
                lcm=i;
            }
            ++lcm;
        }
        System.out.println(lcm);
    }
}
