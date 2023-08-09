package com.daniil.PracticeLeetcode.EASY.LengthOfLastWord;

public class Solution {
    public static void main(String[] args) {
        String st = "a";
        int x = lengthOfLastWord(st);
        System.out.println(x);

    }

    public static int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int length = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] != ' ') {
                length = length + 1;
            }
            if (length >= 0 && chars[i] == ' '){
                break;
            }
        }
        return length;
    }
}
