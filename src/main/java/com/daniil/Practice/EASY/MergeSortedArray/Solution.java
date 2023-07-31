package com.daniil.Practice.EASY.MergeSortedArray;


import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);


    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        int j = 0;
//        for (int i = m; i < nums1.length; i++) {
//            if (i > m - 1) {
//                nums1[i] = nums2[j];
//                j = j + 1;
//            }
//        }
//        Arrays.sort(nums1);
//        System.out.println(Arrays.toString(nums1));
//    }
        int nums1Index = m - 1;
        int nums2Index = n - 1;
        int resultIndex = m + n - 1;
        while (nums1Index >= 0 && nums2Index >= 0) {
            nums1[resultIndex--] = (nums1[nums1Index] > nums2[nums2Index]) ? nums1[nums1Index--] : nums2[nums2Index--];
        }

        while (nums2Index >= 0) {
            nums1[resultIndex--] = nums2[nums2Index--];
        }
    }
}
