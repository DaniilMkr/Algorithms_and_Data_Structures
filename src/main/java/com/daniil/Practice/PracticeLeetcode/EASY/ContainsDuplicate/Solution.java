package com.daniil.Practice.PracticeLeetcode.EASY.ContainsDuplicate;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints1 = new int[]{1,2,3,1};
        int[] ints2 = new int[]{1,2,3,4};
        int[] ints3 = new int[]{1,1,1,3,3,4,3,2,4,2};
        boolean x = solution.containsDuplicate(ints3);
        System.out.println(x);
    }

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
