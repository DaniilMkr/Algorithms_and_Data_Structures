package com.daniil.Practice.PracticeJava;

public class SelectionSort {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String[] names = new String[]{"yDH", "JNH", "Vfh", "Lop", "Hdo", "fss"};
        double[] data = new double[]{29.0, 54.0, 85.0, 18.0, 0.0, 6.6};
        sortSales(names, data);
        long finish = System.currentTimeMillis();
        System.out.println(finish - start);
    }
    static void sortSales(String[] names, double[] data ){
        if (names.length != data.length) { // Проверка на количество элементов в массиве. Если не равно, то вывод в консоль и выход из метода
            System.out.println("Corrupted Data");
            return;
        }
        else if (data.length == 0){ // Проверка на пустой массив. Если количество элементов равно (0), то вывод в консоль и выход из метода
            System.out.println("Empty Data");
            return;
        }
        else {
            for (int i = 0, minInd, maxInd; i < data.length / 2; i++) { // Внешний цикл и присвоение значений переменным
                minInd = i;
                maxInd = i;
                double min = data[minInd], tempMax, tempMin;
                double max = data[maxInd];
                for (int j = i + 1; j < data.length - i; j++) { // Внутренний цикл от индекса i + 1
                    if (data[j] < min) { // Сравнение значений и нахождение минимального индекса
                        min = data[j];
                        minInd = j;
                    } else if (data[j] > max) {// Сравнение значений и нахождение максимального индекса
                        max = data[j];
                        maxInd = j;
                    }
                }
                String stMin; // Создание временных переменных типа String и double
                String stMax;
                tempMin = data[i];
                if (data[i] > data[minInd]) { // Сравнение элементов массива с индексом i и minInd и если больше, поменять местами
                    data[i] = data[minInd];
                    data[minInd] = tempMin;
                    stMin = names[i];
                    names[i] = names[minInd];
                    names[minInd] = stMin;
                    if (max == data[minInd]) {  // Если при итерации в цикле найденное значение min index, является
                        maxInd = minInd;        // соседствующим c maxInd, то при замене их местами maxInd будет являться minInd
                    }

                }
                if (data[data.length - 1 - i] < data[maxInd]) { // Сравнение элементов массива с значением при maxInd и если больше, то поменять местами
                    tempMax = data[data.length - 1 - i];
                    data[data.length - 1 - i] = data[maxInd]; // Присвоение значений переменным с индексом length - 1 - i, значения с индексом maxInd
                    data[maxInd] = tempMax;
                    stMax = names[names.length - 1 - i];
                    names[names.length - 1 - i] = names[maxInd];
                    names[maxInd] = stMax;
                }

                printData(names, data); // вызвать метод для отображения данных в консоль

            }
        }
        printData(names, data); // вызвать метод для отображения данных в консоль, когда массивы полностью отсортированы
    }
    private static void printData(String[] names, double[] data) {
        System.out.print("{");
        for (int i=0; i<data.length;i++){
            System.out.print(names[i]+": "+data[i]+", ");
        }
        System.out.println("\b\b}");
    }
}





