package com.company;

import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for (int j = 0; j<6; j++) {
                if(i==0 || i == 4){
                    System.out.print("*");
                }
                else{
                    System.out.print("*");
                      break;}
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 ; j++) {
                if(i == 2 ){
                    System.out.print("*");
                }
                else{
                    if(j==0 || j==4){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
        System.out.println("");
        for(int i=0;i<5;i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 2 || i == 4) {
                    System.out.print("*");
                } else {
                    System.out.print("*");
                    break;
                }
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 4) {
                    System.out.print("*");
                } else {
                    if (j == 0) {
                        System.out.print("*");
                        } else {
                            System.out.print("");
                        }

                }

            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 4) {
                    System.out.print("*");
                } else {
                    if (j == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print("");
                    }

                }

            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(i==0 || i==4){
                    System.out.print("*");
                }
                else{
                    if(j==2){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }
}
