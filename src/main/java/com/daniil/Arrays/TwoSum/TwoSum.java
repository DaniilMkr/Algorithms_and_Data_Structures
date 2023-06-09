package com.daniil.Arrays.TwoSum;


import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int [] nums = new int[]{2, 7, 11, 15};
        int [] array = twoSum(nums, 9);
        System.out.println(Arrays.toString(array));
    }


    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new RuntimeException("Not found");
    }
}