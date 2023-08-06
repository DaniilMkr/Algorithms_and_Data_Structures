package com.daniil.PracticeLeetcode.EASY.ReverseInteger;


public class Solution {

    public static void main(String[] args) {
        int str = reverse(1534236469);
        System.out.println(str);

    }

    public static int reverse(int x) {

        long v = 0;
        while (x != 0) {
            int t = x % 10;
            v = v * 10 + t;
            x = x / 10;
        }
        if (v < Math.pow(-2, 31) || v > Math.pow(2, 31)) {
            return 0;
        }
        return (int) v;

    }
}

