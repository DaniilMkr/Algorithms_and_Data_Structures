package com.daniil.Practice.PracticeJava;

public class SelectionSort {
    public static void main(String[] args) {
        String[] names = new String[]{"Австралия", "Сингапур", "Китай", "Россия", "Америка", "Япония"};
        double[] data = new double[] {4.0, 5.6, 3.0, 3.9, 6.0, 7.0};
        sortSales(names, data);
    }

    static void sortSales(String[] names, double[] data ){
        if (names.length != data.length) {  // Проверка на количество элементов в массиве. Если не равно, то вывод в консоль и выход из метода
            System.out.println("Corrupted Data");
            return;
        }
        else if (data.length == 0){  // Проверка на пустой массив. Если количество элементов равно (0), то вывод в консоль и выход из метода
            System.out.println("Empty Data");
            return;
        }
        else {
            for (int i = 0, minInd, maxInd; i < data.length / 2; i++) { // Внешний цикл и присвоение переменным значений
                minInd = i;
                maxInd = i;
                double min = data[minInd], tempMax, tempMin;
                for (int j = i + 1; j < data.length - i; j++) { // Внутренний цикл от индекса i + 1
                    if (data[j] < min) { // Сравние значений и нахождение минимального индекса
                        min = data[j];
                        minInd = j;
                    } else if (data[j] > min) {// Сравние значений и нахождение максимального индекса
                        maxInd = j;
                    }
                }
                String stMin; // Создание временных переменных типа String и double
                String stMax;
                stMin = names[i]; // Присвоение временным переменным значений с индексом i и length - 1 - i соответственно
                tempMin = data[i];
                stMax = names[names.length - 1 - i];
                tempMax = data[data.length - 1 - i];
                data[data.length - 1 - i] = data[maxInd]; // Присвоение значений пременным с индексом length - 1 - i, значения с индексом maxInd
                names[names.length - 1 - i] = names[maxInd];
                names[i] = names[minInd]; // Присвоение значений пременным с индексом i, значения с индексом minInd
                data[i] = data[minInd];
                data[maxInd] = tempMax; // Присвоение значений пременным с индексом maxInd, значения временных переменных
                data[minInd] = tempMin;
                names[maxInd] = stMax;
                names[minInd] = stMin;

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
