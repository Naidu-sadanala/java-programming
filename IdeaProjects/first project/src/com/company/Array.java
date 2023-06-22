package com.company;
import java.util.Scanner;
import java.util.Arrays;


public class Array {
    public static boolean tostring;

    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        // datatype[] name = new datatype[size]
        int[] naidu = new int[5];
        //directly
        int[] sadanala = {10, 20 ,30 ,51};
        for (int i = 0; i < naidu.length; i++){
            naidu[i] = in.nextInt();
        }
        System.out.println (Arrays.toString(naidu));
       // for (int j : naidu) {//for each loop
            //for every element in the array print the element
            // here j represents elements in the array
          //  System.out.print(j + " ");
       // }
    }

}
