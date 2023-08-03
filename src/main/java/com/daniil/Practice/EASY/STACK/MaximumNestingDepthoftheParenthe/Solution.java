package com.daniil.Practice.EASY.STACK.MaximumNestingDepthoftheParenthe;



import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        String st = "(1+(2*3)+((8)/4))+1";
        int result = maxDepth(st);
        System.out.println(result);
    }


    public static int maxDepth(String s) {
        char[] ch = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for (char i : ch) {
            st.push(i);
        }
        int counter = 0;
        int max = 0;
        while (!st.isEmpty()) {
            char removed = st.pop();
            if (removed == ')') {
                counter++;
            }
            if (removed == '(') {
                if (counter > max) {
                    max = counter;
                }
                counter--;
            }
        }
        return max;
    }
}



