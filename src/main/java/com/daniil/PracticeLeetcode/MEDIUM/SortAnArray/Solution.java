package com.daniil.PracticeLeetcode.MEDIUM.SortAnArray;


import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int [] y = new int[] {5, 2, 3, 1};
//        sortWithRecursion(y, 0, y.length - 1);
        sortArray(y);
        System.out.println(Arrays.toString(y));

    }

    public static int[] sortArray(int[] nums) {
        sortWithRecursion(nums, 0, nums.length - 1);
        return nums;
    }

    public static void sortWithRecursion(int[] x, int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            sortWithRecursion(x, l, mid);
            sortWithRecursion(x, mid + 1, r);
            sortMerge(x, l, mid, r);
        }
    }

    private static void sortMerge(int[] x, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = x[i + l];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = x[mid + 1 + j];
        }
        int i = 0;
        int j = 0;
        int k = l;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                x[k] = L[i];
                i++;
            } else {
                x[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            x[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            x[k] = R[j];
            j++;
            k++;
        }
    }
}
