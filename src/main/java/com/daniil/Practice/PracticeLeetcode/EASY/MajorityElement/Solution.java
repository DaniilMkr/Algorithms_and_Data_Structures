package com.daniil.Practice.PracticeLeetcode.EASY.MajorityElement;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        int[] x = new int[]{3, 3, 4};
        int result = majorityElement(x);
        System.out.println(result);

    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            }
            else {
                int value = map.get(nums[i]);
                map.put(nums[i], map.get(nums[i]) + 1);
            }

        }

        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}



