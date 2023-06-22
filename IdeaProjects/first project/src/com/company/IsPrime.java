package com.company;

public class IsPrime {
    public static void main(String[] args) {
        int n = 25;
        for (int i = 0; i < n; i++) {
            System.out.println(i + "  " +prime(i));
        }
    }
    static boolean prime(int n){
        if (n <= 1){
            return false;
        }
        int check = 2;
        while(check * check <= n){
            // here we are using square root method
            /* by the square rooting we can decrease the complexity by root N
               ex: check <= sqrt(n)
               by squaring both sides
               check^2 <= n
             */
            if(n % check == 0){
                return false;
            }
            check ++;
        }
        return true;
    }
}
