package com.daniil.Practice.PracticeLeetcode.EASY.SingleNumber;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        int [] x = new int[] {4,1,2,1,2};
        int test = singleNumber(x);
        System.out.println(test);
    }

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

        }

        return Collections.min(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

}

