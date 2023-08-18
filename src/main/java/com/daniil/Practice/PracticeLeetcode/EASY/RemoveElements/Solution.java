package com.daniil.Practice.PracticeLeetcode.EASY.RemoveElements;


public class Solution {

    public static void main(String[] args) {
        int[] x = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int t = removeElement(x, 2);

    }

    public static int removeElement(int[] nums, int val) {
        int counter = 0;
        int tem = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                tem = nums[counter];
                nums[counter] = nums[i];
                nums[i] = tem;
                counter++;
            }
        }
        return counter;
    }
}
