package com.Questions;
import java.util.*;

import static java.util.Arrays.copyOf;

public class Question9 {
    public static int weiredArray(int[] n){
        int maxVal=0;
        int maxValNum=-1;
        int count =0;
        int[] m = copyOf(n,n.length);
        Arrays.sort(m);
        int temp = m[0];
        for (int i:m) {
            if(i==temp){
                count++;
               if(count>=maxVal) {
                   maxVal++;
                   maxValNum = i;
               }
            }
            if(i!=temp){
               count= 1;
               temp = i;
            }
        }
        if(maxVal==1){return 0;}
        int result=n.length;
        int currCount=0;
        for(int i =0;i<n.length;i++){
            if(n[i]==maxValNum){
             currCount++;
            }else{
                currCount=0;
            }
            if(currCount==maxVal){
                result = Math.min(result,i+1);
            }
        }
        return  result - maxVal + 1;
    }

    public static void main(String[] args) {
        int[] n = {5,5,5,5,5,5,5,1,1,1};
        int ans = weiredArray(n);
        System.out.println(ans);
    }
}
