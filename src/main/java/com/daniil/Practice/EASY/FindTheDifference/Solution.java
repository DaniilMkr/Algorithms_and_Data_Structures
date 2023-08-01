package com.daniil.Practice.EASY.FindTheDifference;


import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        String s = "";
        String t = "y";

        char r = findTheDifference(s,t);
        System.out.println(r);
    }

    public static char findTheDifference(String s, String t) {
        int sumS = 0;
        int sumT = 0;
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        for (char c : s1) {
            sumS = sumS + c;
        }
        for (char c : s2) {
            sumT = sumT + c;
        }
        int b = sumT - sumS;

        return (char) b;

    }
}
