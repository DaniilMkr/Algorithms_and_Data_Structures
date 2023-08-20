package com.daniil.Practice.PracticeJava;

public class MergeSort {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String[] names = new String[]{"Австралия", "Сингапур", "Китай", "Россия", "Америка", "Япония",
                "Франция", "Фуджи", "Бельгия", "Испания", "Германия", "Италия", "Австралия"};
        double[] data = new double[]{4.0, 5.6, 3.0, 3.9, 6.0, 7.0, 2.5, 4.8, 1.3, 7.9, 2.9, 9.0, 3.6};

        boolean valid = validation(names, data);
        if (valid) {
            printData(names, data);
            sortStoresSales(names, data);
            printData(names, data);
            long finish = System.currentTimeMillis();
            System.out.println(finish - start);
        }
    }


    public static void sortStoresSales(String[] names, double[] data) {
            String[] leftName = new String[names.length / 2]; // Деление массива на два для double и String с соответствующей длиной
            String[] rightName = new String[names.length - leftName.length];
            double[] leftData = new double[data.length / 2];
            double[] rightData = new double[data.length - leftData.length];

            for (int i = 0; i < data.length; i++) {  // Присвоение значений элементов из массива data массивам leftData, leftName
                if (i < leftData.length) {
                    leftData[i] = data[i];
                    leftName[i] = names[i];
                } else {                           // Присвоение значений элементов из массива data массивам rightData, rightName
                    rightData[i - leftData.length] = data[i];
                    rightName[i - leftName.length] = names[i];
                }
            }

            if (rightData.length > 1 && rightName.length > 1) {    // Вызов рекурсии пока не найдено базовое условие
                sortStoresSales(leftName, leftData);
                sortStoresSales(rightName, rightData);
            }

            int i = 0;   // Ввести переменные для подсчета индексов
            int j = 0;
            int k = 0;

            while (i < leftData.length && j < rightData.length ) {  // Сравнить значения элементов массива
                if (leftData[i] <= rightData[j]) {  // Если элемент массива слева меньше или равен чем элемент справа, то записать в массив data левый элемент
                    data[k] = leftData[i];
                    names[k] = leftName[i];
                    i++;
                } else {  // Иначе, записать в массив data правый элемент
                    data[k] = rightData[j];
                    names[k] = rightName[j];
                    j++;
                }
                k++; // Увеличить индекс на 1
            }
            while (i < leftData.length) {  // Собрать отсортированные оставшиеся элементы
                data[k] = leftData[i];
                names[k] = leftName[i];
                i++;
                k++;
            }
            while (j < rightData.length) {
                data[k] = rightData[j];
                names[k] = rightName[j];
                j++;
                k++;
            }
        }


    public static boolean validation(String[] names, double[] data) {
        if (names.length != data.length) {  // Проверка на количество элементов в массиве. Если не равно, то вывод в консоль и выход из метода
            System.out.println("Corrupted Data");
            return false;
        }
         else if (data.length == 0) {  // Проверка на пустой массив. Если количество элементов равно (0), то вывод в консоль и выход из метода
            System.out.println("Empty Data");
            return false;
        }
         else {
             return true;
        }
    }

    private static void printData(String[] names, double[] data) {
        System.out.print("{");
        for (int i=0; i<data.length;i++){
            System.out.print(names[i]+": "+data[i]+", ");
        }
        System.out.println("\b\b}");
    }
}




