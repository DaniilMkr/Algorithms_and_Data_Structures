package com.daniil.Practice.PracticeLeetcode.MEDIUM.LetterCombinationsofaPhoneNumber;


import java.util.*;

public class Solution {

    public static void main(String[] args) {
        List<String> st = letterCombinations("234");



    }

    public static List<String> letterCombinations(String digits) {
        Queue<String> cache = new LinkedList<>();
        Map<Character, List<String>> map = new HashMap<>();
        populateMap(map);


        for (char curr : digits.toCharArray()) {
            List<String> mappedToChar = map.get(curr);

            if (cache.isEmpty()) {
                for (String str : mappedToChar) {
                    cache.add(str);
                }
            } else {
                int size = cache.size();
                for (int i = 0; i < size; i++) {
                    String currStr = cache.poll();
                    for (String str : mappedToChar) {
                        cache.add(currStr + str);
                    }
                }
            }
        }
        return new ArrayList<String>(cache);
    }
    private static void populateMap(Map<Character, List<String>> map) {
        map.put('2', List.of("a", "b", "c"));
        map.put('3', List.of("d", "e", "f"));
        map.put('4', List.of("g", "h", "i"));
        map.put('5', List.of("j", "k", "l"));
        map.put('6', List.of("m", "n", "o"));
        map.put('7', List.of("p", "q", "r", "s"));
        map.put('8', List.of("t", "u", "v"));
        map.put('9', List.of("w", "x", "y", "z"));

    }

}