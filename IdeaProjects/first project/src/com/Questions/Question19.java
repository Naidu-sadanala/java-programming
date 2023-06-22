package com.Questions;

import java.util.ArrayList;
public class Question19 {
    public static void main(String[] args) {
        String[] ch = {"a","b","c","d","e"};
        int[] num = {1,2,3,4};
        int loop = Math.max(ch.length,num.length);
        int min = Math.min(ch.length, num.length);
        ArrayList<String> arr = new ArrayList<>();
        int indexOFString = 0;
        int indexOfNUmber=0;
        for (int i = 0; i < loop ; i++) {
            if(ch.length==min){
                if(indexOFString==min){
                    indexOFString =0;
                }
                arr.add(ch[indexOFString]);
                indexOFString++;
                String str = (num[indexOfNUmber] + "");
                indexOfNUmber++;
                arr.add(str);
            }
            else{
                if(indexOfNUmber==min){
                    indexOfNUmber =0;
                }
                arr.add(ch[indexOFString]);
                indexOFString++;
//                String str = Integer.toString(num[i]);
                String str = (num[indexOfNUmber] + "");
                indexOfNUmber++;
                arr.add(str);
            }
        }
        System.out.println(arr);
    }
}
