package com.daniil.Practice.EASY.ValidAnagram;


import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        boolean test = isAnagram("anagram", "nagaram");
        System.out.println(test);
    }

    public static boolean isAnagram(String s, String t) {
        int[] freqF = new int[26];
        int[] freqS = new int[26];

        for(int i = 0; i < s.length();i++) {
            freqF[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < t.length();i++) {
            freqS[t.charAt(i) - 'a']++;
        }
        if(Arrays.equals(freqF,freqS))
        {
            return true;
        }
        return false;
    }
}
