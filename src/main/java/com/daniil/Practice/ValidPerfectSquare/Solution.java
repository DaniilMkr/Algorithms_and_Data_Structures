package com.daniil.Practice.ValidPerfectSquare;


public class Solution {

    public static void main(String[] args) {
        boolean result = isPerfectSquare(9);
        System.out.println(result);
    }

    public static boolean isPerfectSquare(int num) {
        int i = 1;
        while (num > 0) {
            num = num - i;
            i = i + 2;

        }
        return num == 0;
    }
}
