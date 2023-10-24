package com.daniil.Practice.PracticeLeetcode.EASY.CountPairsWhoseSumisLessthanTarget;


import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> list = new ArrayList<>(){};
        list.add(-1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        int target = solution.countPairs(list, 2);
        System.out.println(target);

    }

    public int countPairs(List<Integer> list, int target) {
        // пройти по массиву двумя циклами
        int countPairs = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                // взять из циклов значения индексов и сложить их
                if (list.get(i) + list.get(j) < target) {
                    // проверить на условие
                    countPairs++;
                }
            }
        }
        return countPairs;
    }
}
