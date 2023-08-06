package com.daniil.PracticeLeetcode.MEDIUM.ARRAY.StepstoMakeArrayNondecreasing;


import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int[] x = new int[]{5, 3, 4, 4, 7, 3, 6, 11, 8, 5, 11};
        int list = totalSteps(x);
        System.out.println(list);


    }

    public static int totalSteps(int[] nums) {
        List<Integer> list = new LinkedList<>();
        for (Integer x : nums) {
            list.add(x);
        }
        int firstPointer = 0;
        int secondPointer = 1;
        int step = 0;
        int nextIt = list.size();
        boolean quit = true;
        while (quit) {
            while (secondPointer < list.size()) {
                if (secondPointer == list.size() - 1) {
                    step++;
                }
                if (list.get(firstPointer) > list.get(secondPointer)) {
                    list.remove(secondPointer);

                }
                firstPointer++;
                secondPointer++;

                if (nextIt == list.size() && secondPointer == list.size()) {
                    quit = false;
                }
            }

        }
        return step;
    }
}





