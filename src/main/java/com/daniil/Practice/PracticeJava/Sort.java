package com.daniil.Practice.PracticeJava;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {
        int[][] data = new int[][]{{10, 2, 4}, {10, 9, 6}, {2, 3, 8}, {1, 2,4}, {3, 4, 7}, {3, 6, 4}, {3, 9, 2}, {4, 5, 7}, {4, 6, 3}, {5, 6, 10}, {1, 8, 8}, {6, 7, 2}, {7, 8, 1}, {8, 9, 7}};
        System.out.println(Arrays.deepToString(data));
        sort(data);
    }


    public static void sort(int[][] data) {
        boolean valid = validate(data); // Метод возвращает false если входящие данные не соответствуют условию.
        if (valid) {
            for (int j = 0; j < data.length; j++) { // Цикл для определения элемента с максимальным индексом
                int maxIndex = j;
                for (int i = j + 1; i < data.length; i++) {
                    if (data[i][0] > data[maxIndex][0]) { // Если элемент с индексом j + 1 больше элемента с индексом j, то обновить максимальный индекс
                        maxIndex = i;
                    }
                }
                if (maxIndex != j) {  // Поменять местами элементы с найденым максимальным индексои и индексом j + 1;
                    for (int l = 0; l < data[l].length; l++) {
                        int temp = data[j][l];
                        data[j][l] = data[maxIndex][l];
                        data[maxIndex][l] = temp;
                    }

                }
            }
            System.out.println(Arrays.deepToString(data));  // Вывести в консоль отсортированный массив
        }
    }
    private static boolean validate(int[][] data) {
        if (data == null) {  // Если массив data ссылается на null, то массив пустой (не существует)
            System.out.println("Empty data");
            return false;
        } else {
            for (int i = 0; i < data.length; i++) {  // Итерация по масиву
                if (data[i] == null) { // Если элемент массива с индексом i равен null, то вывести индекс при котором null и выйти из цикла
                    System.out.println("Empty data at index " + "[" + i + "," + 0 + "]");
                    return false;
                }
                if (data[i].length == 0) { // Если массив равен длинне ноль, то вывести элемент при этом индексе
                    System.out.println("Unavailable data at index " + "[" + i + "," + 0 + "]");
                    return false;
                }
                for (int j = 0; j < data[i].length && data[i].length != 3; j++) {  // Если массив содержит меньше или больше трех элементов, то вывести элемент
                        for (int p = 0; p < data[i].length; p++) {
                            if (p == data[i].length - 1) {
                                p = p + 1;
                                System.out.println("Unavailable data at index " + "[" + i + "," + p + "]");
                                return false;
                            }
                        }
                }
            }
        }
        return true;
    }
}



