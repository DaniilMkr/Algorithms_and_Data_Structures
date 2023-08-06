package com.daniil.Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {

  public static void main(String[] args) {
    int [] x = new int[] {2,4,1,4,6,3,5,7,8,2};
    sort(x, 0, x.length - 1);
    System.out.println(Arrays.toString(x));

  }

  public static void mergeSort(int[] array, int l, int m, int r) {

    int n1 = m - l + 1;
    int n2 = r - m;

    int [] L = new int[n1];
    int [] R = new int[n2];

    for (int i = 0; i < n1; i++) {
      L[i] = array[i + l];
    }

    for (int j = 0; j < n2; j++) {
      R[j] = array[m + 1 + j];
    }

    int i = 0;
    int j = 0;
    int k = l;

    while (i < n1 && j < n2) {
        if (L[i] <= R[j]) {
          array[k] = L[i];
          i++;
        } else {
          array[k] = R[j];
          j++;
        }
        k++;
      }
      while (i < n1) {
        array[k] = L[i];
        i++;
        k++;
      }
      while (j < n2) {
        array[k] = R[j];
        j++;
        k++;
      }
    }
    static void sort(int[] array, int l, int r) {
    if (l < r) {
      int m = l + (r - l) / 2;
      sort(array, l, m);
      sort(array, m + 1, r);
      mergeSort(array, l, m, r);
    }

  }


}


















//
//
//  public static void main(String[] args) {
//    int [] x = new int[] {2,4,1,4,6,3,5,7,8,2};
//    mergeSort(x, 0, x.length - 1);
//  }
//
//  static void merge(int[] A, int left, int middle, int right) {
//    int[] leftTmpArray = new int[middle-left+2];
//    int[] rightTmpArray = new int[right-middle+1];
//    for (int i=0; i<=middle-left; i++) {
//      leftTmpArray[i] = A[left+i];
//    }
//    for (int i=0; i<right-middle; i++) {
//      rightTmpArray[i] = A[middle+1+i];
//    }
//
//
//    leftTmpArray[middle-left+1] = Integer.MAX_VALUE;
//    rightTmpArray[right-middle] = Integer.MAX_VALUE;
//
//    int i = 0, j = 0;
//    for (int k = left; k<=right; k++) {
//      if (leftTmpArray[i] < rightTmpArray[j]) {
//        A[k] = leftTmpArray[i];
//        i++;
//      } else {
//        A[k] = rightTmpArray[j];
//        j++;
//      }
//
//    }
//
//  }
//
//  public static void mergeSort(int[] Array, int left, int right) {
//    if (right > left) {
//      int m = (left+right)/2;
//      mergeSort(Array, left, m);
//      mergeSort(Array, m+1, right);
//      merge(Array, left, m, right);
//    }
//  }
//
//
//
//	public static void printArray(int []array) {
//		for (int i = 0; i < array.length; i++) {
//			System.out.print(array[i]+"  ");
//		}
//	}
//
//}
