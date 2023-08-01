package com.daniil.Practice.EASY.IntersectionofTwoArrays;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};
        intersection(nums1, nums2);
    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            set2.add(nums2[i]);
        }

        Set<Integer> result = new HashSet<>();
        for (int i : set1) {
            if (set2.contains(i)) {
                result.add(i);
            }
        }

        int[] res = new int[result.size()];
//        int [] r = result.stream().mapToInt(Integer::intValue).toArray();
        int index = 0;
        for (int i : result) {
            res[index++] = i;
        }
        return res;
    }
}
