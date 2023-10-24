package com.daniil.Practice.PracticeLeetcode.EASY.ValidPalindrome;


public class Solution {

    public static void main(String[] args) {

        String st = "A man, a plan, a canal: Panama";

        boolean result = isPalindrome(st);
        System.out.println(result);
    }


    public static boolean isPalindrome(String s) {
        String st = s.toLowerCase().replaceAll("[^a-z\\d]", "");
        int first = 0;
        int second = st.length() - 1;
        while (first != st.length() && second != -1) {
            if (st.charAt(first) == st.charAt(second)) {
                first++;
                second--;
            } else {
                return false;
            }
        }
        return true;
    }
}

