package com.daniil.PracticeLeetcode.EASY.ClimbingStairs;


public class Solution {

    public static void main(String[] args) {
        int result = climbStairs(3);
        System.out.println(result);


    }

    public static int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int x = climbStairs(n -1);
        int y = climbStairs(n - 2);
        return  x + y;
    }

}
