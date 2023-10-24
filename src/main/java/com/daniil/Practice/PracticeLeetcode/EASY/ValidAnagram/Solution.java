package com.daniil.Practice.PracticeLeetcode.EASY.ValidAnagram;


import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean d = solution.isAnagram("anagram", "nagaram");
        System.out.println(d);

    }


    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        if (s.length() != s2.length) {
            return false;
        } else {
            for (int i = 0; i < s1.length; i++) {
                if (s1[i] != s2[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
