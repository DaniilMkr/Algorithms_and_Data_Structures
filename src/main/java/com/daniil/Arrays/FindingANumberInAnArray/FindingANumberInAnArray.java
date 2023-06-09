package com.daniil.Arrays.FindingANumberInAnArray;


import java.util.Arrays;

public class FindingANumberInAnArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        int value = searchInArray(nums, 6);
        System.out.println(value);
    }


    public static int searchInArray(int[] intArray, int valueToSearch) {
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == valueToSearch) {
                return i;
            }
        }
        return 0;
    }
}

