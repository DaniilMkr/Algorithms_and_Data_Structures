package com.daniil.Practice.PracticeLeetcode.EASY.ValidParentheses;


import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        boolean str = isValid("(){}{}");
        System.out.println(str);

    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char aChar : s.toCharArray()) {
            if (aChar == '(') {
                stack.push(')');
            } else if (aChar == '{') {
                stack.push('}');
            } else if (aChar == '[') {
                stack.push(']');
            }
            else if (stack.isEmpty() || stack.pop() != aChar) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
