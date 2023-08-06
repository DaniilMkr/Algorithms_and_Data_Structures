package com.daniil.Sorting;

import java.util.Arrays;

public class BubbleSort {


  public static void main(String[] args) {
    int[] x = new int[]{5, 9, 3, 1, 2, 8, 4, 7, 6, 4, 20, 43};
    bubbleSort(x);
    System.out.println(Arrays.toString(x));
  }

  static void bubbleSort(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n-1; i++) {
      for (int j =0; j < n-i-1; j++) {
        if (arr[j] > arr[j+1]) {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
  }

  void printArray(int arr[]) {
    int n = arr.length;
    for (int i = 0; i<n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}
