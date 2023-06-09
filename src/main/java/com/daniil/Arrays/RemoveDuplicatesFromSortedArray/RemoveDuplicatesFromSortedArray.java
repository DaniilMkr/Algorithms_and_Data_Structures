package com.daniil.Arrays.RemoveDuplicatesFromSortedArray;


import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int mid = Exercise.removeDuplicates(new int[args.length]);
        System.out.println(mid);
    }

    public static class Exercise {
        public static int removeDuplicates(int[] array) {
            array = new int[]{1, 1, 2, 2, 3};
            int length = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        length++;
                        array[i] = Integer.MIN_VALUE;
                    }
                }
            }
            return array.length - length;
        }
    }
}