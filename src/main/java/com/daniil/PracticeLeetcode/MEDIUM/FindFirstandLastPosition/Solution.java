package com.daniil.PracticeLeetcode.MEDIUM.FindFirstandLastPosition;


import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] myArray = searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);
        System.out.println(Arrays.toString(myArray));



    }

    public static int[] searchRange(int[] nums, int target) {
        int [] result = new int[2];
        result[0] = first(nums, target);
        result[1] = last(nums, target);
        return result;
    }

    private static int last(int[] nums, int target) {
        int high = nums.length - 1;
        int low = 0;
        int index = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            }
            else high = high - 1;
            if (nums[mid] == target) {
                index = mid;
                break;
            }
        }
        return index;
    }

    private static int first(int[] nums, int target) {
        int high = nums.length - 1;
        int low = 0;
        int index = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] > target) {
                high = mid - 1;
            }
            else low = low + 1;
            if (nums[mid] == target) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
