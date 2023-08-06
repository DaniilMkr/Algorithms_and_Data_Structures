package com.daniil.Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] x = new int[]{5, 9, 3, 1, 2, 8, 4, 7, 6, 4, 20, 43};
        insertionSort(x);
    }

	// InsertionSort
  static void insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int temp = arr[i], j = i;
      while ( j> 0 && arr[j-1]>temp) {
        arr[j] = arr[j-1];
        j--;
      }
      arr[j] = temp;
    }
  }


	public static void printArray(int []array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"  ");
		}
	}

}
