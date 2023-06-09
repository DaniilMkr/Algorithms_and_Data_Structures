package com.daniil.Arrays.IsUnique;


import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class IsUnique {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 4, 5, 6};
        boolean result = IsUnique(nums);
        System.out.println(result);
    }


    public static boolean IsUnique(int[] intArray) {
        Set<Integer> array = new HashSet<>();
        for (int i = 0; i < intArray.length; i++) {
            if (array.contains(intArray[i])) {
                return false;
            }
            array.add(intArray[i]);
        }
        return true;
    }
}
