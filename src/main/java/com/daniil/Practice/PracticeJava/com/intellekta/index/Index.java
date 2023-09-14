package com.daniil.Practice.PracticeJava.com.intellekta.index;

import java.util.*;

public class Index {
    private String text;
    private SortedMap <String, Integer> map = new TreeMap<>();

    public Index() {}

    public Index(String text) {
        this.text = appendText(text);
    }

    public String setText(String text) {
        if (text == null) {
            throw new NullPointerException("Text is null");
        }
        StringBuilder result = new StringBuilder(text.length());
        String st = text.toLowerCase();
        for (int i = 0; i < st.toLowerCase().length(); i++){
            char c = st.charAt(i);
            if (Character.isAlphabetic(c) || Character.isWhitespace(c)){
                result.append(c);
            }
        }
        return String.valueOf(result);
    }

    public int getWordFrequency(String text) {
        int index;
        try {
            index = map.get(setText(text));
        } catch (Exception e) {
            throw new NullPointerException("Text not found");
        }
        return index;
    }

    public Map<String, Integer> getFrequencyTable(){
        return map;
    }

    public String appendText(String text) {
        String result = setText(text);
        String [] strings = result.split(" ");
        for (String s : strings) {
            if (map.get(s) == null) {
                map.put(s, 1);
            }
            else {
                map.put(s, map.get(s) + 1);
            }
        }
        return result;
    }
}
