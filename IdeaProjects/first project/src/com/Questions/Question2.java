package com.Questions;

public class Question2 {
    public static void main(String[] args) {
        System.out.println(myAtoi("words and 987"));
    }
    static int myAtoi(String s) {
        String[] st = s.split(" ");
        for(int i =0;i<st.length;i++){

            try{
                int n = Integer.valueOf(st[i]);
                if(n<=Integer.MAX_VALUE || n>=Integer.MIN_VALUE){
                    return n;
             }
            }catch(Exception e){

            }
        }
        return 0;
    }
}

