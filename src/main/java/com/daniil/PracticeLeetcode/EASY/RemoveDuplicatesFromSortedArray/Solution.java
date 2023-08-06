package com.daniil.PracticeLeetcode.EASY.RemoveDuplicatesFromSortedArray;


import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] x = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result = removeDuplicates(x);
    }

    public static int removeDuplicates(int[] nums) {
        int index = 0;
        int counter = 0;
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[index] == nums[i]) {
                nums[index] = Integer.MAX_VALUE;
                index++;
                counter++;
            }
            else {
                index++;
            }
        }
        Arrays.sort(nums);
        return nums.length-counter;
    }
}
