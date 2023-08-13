package com.daniil.PracticeLeetcode.EASY.FindtheIndexoftheFirstOccurrenceinaString;


import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        int result = strStr("mississippi", "issip");
        System.out.println(result);


    }

    public static int strStr(String haystack, String needle) {
        char[] x = haystack.toCharArray();
        char[] y = needle.toCharArray();
        int index = 0;
        int counter = Integer.MAX_VALUE;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == y[index] && x.length >= y.length) {
                if (index == 0) {
                    counter = i;
                }
                index++;
                if (index == y.length) {
                    break;
                }
            } else {
                index = 0;
                counter = Integer.MAX_VALUE;
            }
        }
        if (counter != Integer.MAX_VALUE) {
            return counter;
        }
        return -1;
    }
}
