package com.company;
import java.util.ArrayList;


public class Question10 {
    public static void main(String[] args) {
        int[][] grid = new int[][]{{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0} };
        ArrayList <Integer> need = new ArrayList<Integer>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j]==1) {
                    int a = naidu(grid, i, j);
                    need.add(a);
                }
            }
            
        }
        System.out.println(need);

    }
    public static int naidu(int[][] grid,int i, int j){
        if(i == -1 || j == -1 || i == grid.length|| j == grid[i].length){
            return 0;
        }
        if(grid[i][j] == 1){
            int a = 0;
            int b = 0;
            if(grid[i][j+1] == 1){
                 b  = helper(grid,i,j+1);
            }
            a = naidu(grid,i+1,j) + 1;
            return a + b;
        }
        else{
            return 0;
        }
    }
    public static int helper(int[][] grid,int i, int j){
        if(i == -1 || j == -1 || i == grid.length|| j == grid[i].length){
            return 0;
        }
        if(grid[i][j] == 1){
               int a = helper(grid,i,j+1) + 1;
               return a;
        }
        else{
            return 0;
        }
    }
}
