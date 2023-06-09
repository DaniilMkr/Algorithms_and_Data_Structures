package com.daniil.Arrays.RemoveDuplicates;


import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] mid = Exercise.removeDuplicates(new int[args.length]);
        System.out.println(Arrays.toString(mid));
    }

    public static class Exercise {
        public static int[] removeDuplicates(int[] array) {
            array = new int[]{1, 1, 2, 2, 1, 3,3, 4, 5,6,6};
            int length = 0;
            int finalLength = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        length++;
                        array[i] = Integer.MIN_VALUE;
                    }
                }
            }
            finalLength = array.length - length;
            int u = 0;

            int[] myArray = new int[finalLength];
            for (int l = 0; l < array.length; l++) {
                if (array[l] != Integer.MIN_VALUE) {
                    for (int k = u ; k < myArray.length; k++) {
                        myArray[k] = array[l];
                        u++;
                        break;
                    }
                }
            }
            return myArray;
        }
    }
}
