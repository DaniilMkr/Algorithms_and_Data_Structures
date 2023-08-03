package com.daniil.Practice.MEDIUM.GenerateParentheses;


import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        List<String> myList = generateParenthesis(3);
        System.out.println(myList);


    }

    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backTracking(list, n, 0, "");
        return list;

    }
    public static void backTracking(List<String> list, int left,int right, String s) {
        if (left==0 && right==0) {
            list.add(s);
            return;
        }

        if (left > 0) {
            backTracking(list, left - 1, right + 1, s+"(");
        }
        else {
            backTracking(list, left, right - 1, s+")");
        }
    }
}

