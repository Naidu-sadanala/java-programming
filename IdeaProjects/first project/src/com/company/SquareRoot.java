package com.company;

public class SquareRoot {
    public static void main(String[] args) {
        int n = 36;
        int p = 3;
        System.out.printf("%.3f",sqrt(n,p));
    }
    static double sqrt(int n, int p){
        double root = 0.0;
        float inc = 0.1f;
        for (int i = 0; i < p; i++) {
            while(root*root <= n){
                if(root*root == n){
                    return root;
                }
                root+=inc;
            }
            root-=inc;
            inc /= 10;
        }
        return  root;
    }
}
