package com.daniil.Practice.MEDIUM.FindPeakElement;


import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int [] x = new int[] {1,2,6,3,5,6,4};
        int m = findPeakElement(x);
        System.out.println(m);

    }

    public static int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (nums[mid] > nums[mid - 1] && nums[mid] < nums[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}
