package com.daniil.Arrays.Permutation;


import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        int[] firstArray = new int[]{1, 2, 3, 4, 5};
        int[] secondArray = new int[]{5, 1, 2, 3, 4};
        boolean result = permutation(secondArray, firstArray);
        System.out.println(result);
    }


    public static boolean permutation(int[] array2, int[] array1) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array2.length; i++) {
            for (int j = i + 1; j < array2.length; j++) {
                int temp = 0;
                if (array2[i] > array2[j]) {
                    temp = array2[j];
                    array2[j] = array2[i];
                    array2[i] = temp;
                }
            }
        }
        if (Arrays.toString(array2).equals(Arrays.toString(array1))) {
            return true;
        }
        return false;
    }

}
