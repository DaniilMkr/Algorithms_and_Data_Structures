package com.daniil.Arrays.MaxProductofTwoIntegers;


import java.util.Arrays;

public class MaxProductofTwoIntegers {
    public static void main(String[] args) {
        int[] nums = new int[]{30, 10, 20, 50, 60};
        int [] result = maxProduct(nums);
        System.out.println(Arrays.toString(result));
    }


    public static int[] maxProduct(int[] intArray) {
        int maxOne = 0;
        int maxTwo = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (maxOne < intArray[i]) {
                maxTwo = maxOne;
                maxOne = intArray[i];
            } else if (maxTwo < intArray[i]) {
                maxTwo = intArray[i];

            }
        }
        return new int[]{maxOne, maxTwo};
    }
}