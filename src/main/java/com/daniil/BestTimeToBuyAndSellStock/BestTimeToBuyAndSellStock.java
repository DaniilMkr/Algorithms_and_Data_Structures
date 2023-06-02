package com.daniil.BestTimeToBuyAndSellStock;


import java.util.Arrays;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int mid = Exercise.BestTimeToBuyAndSellStock(new int[args.length]);
        System.out.println((mid));
    }


    public static class Exercise {
        public static int BestTimeToBuyAndSellStock(int[] prices) {
            prices = new int[]{7, 1, 5, 3, 6, 4};
            int minPrice = Integer.MAX_VALUE;
            int maxPrice = 0;
            for (int i = 0; i < prices.length; i++) {
                if (prices[i] < minPrice) {
                    minPrice = prices[i];
                } else if (prices[i] - minPrice > maxPrice) {
                    maxPrice = prices[i] - minPrice;
                }
            }
            return maxPrice;
        }
    }
}
