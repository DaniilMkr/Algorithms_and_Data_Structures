package com.daniil.Practice.PracticeLeetcode.EASY.SearchInsertPosition;


public class Solution {

    public static void main(String[] args) {
        int [] x = new int[]{1,3,5,6,7,9,10,11,15};
        int str = searchInsert(x, 8);
        System.out.println(str);

    }

    public static int searchInsert(int[] nums, int target) {
        //[1,3,5,7,8,9]
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (right + left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return left;
    }
}

