package com.daniil.Practice.FindtheIndexoftheFirstOccurrenceinaString;


import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        int result = strStr("sabutsad", "sad");
        System.out.println(result);


    }

    public static int strStr(String haystack, String needle) {
        char[] array = needle.toCharArray();
        char[] x = haystack.toCharArray();
        int counter = 0;
        int second = 0;
        for (int i = 0; i < x.length; i++) {
            int first = 0;
            if (x[i] == array[second]) {
                if (second == 0) {
                    first = i;
                }
                second++;
                if (array.length == second) {
                    return first;
                }
            }
            else {
                second = 0;
            }
        }
        return -1;
    }
}
