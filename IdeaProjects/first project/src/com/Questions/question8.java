package com.Questions;
import java.util.*;
public class question8 {
    public static int weiredArray(int[] n){
        HashMap<Integer,Integer> nai = new HashMap<>();
        for (int i:n) {
            if(nai.containsKey(i)){
                nai.put(i,nai.get(i)+1);
            }else{
                nai.put(i,1);
            }
        }
        int Val=0;
        int ValNum=0;
        for(int key:nai.keySet()){
            if(nai.get(key)>Val){
                Val=nai.get(key);
                ValNum=key;
            }
        }
        if(Val==1){
            return 0;
        }
        int result=n.length;
        int currCount=0;
        for(int i =0;i<n.length;i++){
            if(n[i]==ValNum){
                currCount++;
            }else{
                currCount=0;
            }
            if(currCount==Val){
                result = Math.min(result,i+1);
            }
        }
        System.out.println(nai);
        return  result - Val + 1;
    }

    public static void main(String[] args) {
        int[] n = {3,3};
        int ans = weiredArray(n);
        System.out.println(ans);
    }
}
