package com.daniil.Practice.EASY.LongestSubstring;


import java.util.HashSet;


public class Solution {

    public static void main(String[] args) {
        int str = lengthOfLongestSubstring("abcabcbb");
        System.out.println(str);

    }

    public static int lengthOfLongestSubstring(String s) {
        // Create hashSet map
        HashSet<Character> mySet = new HashSet<>();
        int r = 0; // right index
        int l = 0; // left index
        int out = 0; // result
        char[] st = s.toCharArray(); // convert to char array
        while (r < st.length) {
            if (!mySet.contains(st[r])) {
                mySet.add(st[r]);
                r++;
            }
            else {
                mySet.remove(st[l]);
                l++;
            }
           out = Math.max(mySet.size(), out);
        }
        return out;
    }

}
