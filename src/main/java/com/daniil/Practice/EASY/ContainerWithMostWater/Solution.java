package com.daniil.Practice.EASY.ContainerWithMostWater;


public class Solution {

    public static void main(String[] args) {
        int[] n = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        int maxWater = maxArea(n);
        System.out.println(maxWater);


    }

    public static int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int current = 0;
        int max = 0;
        while (l < r) {
            int min = Math.min(height[l], height[r]);
            current = min * (r - l);
            max = Math.max(max, current);
            if (height[l] > height[r]) {
                r--;
            }
            else {
                l++;
            }
        }
        return max;
    }
}
