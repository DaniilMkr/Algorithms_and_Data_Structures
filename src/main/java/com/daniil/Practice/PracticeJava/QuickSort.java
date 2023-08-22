package com.daniil.Practice.PracticeJava;

public class QuickSort {

    public static void main(String[] args) {
        String[] names = new String[]{"Австралия", "Сингапур", "Китай", "Россия", "Америка", "Япония",
                "Франция", "Фуджи", "Бельгия", "Испания", "Германия", "Италия", "Индия"};
        double[] data = new double[]{4.0, 5.6, 3.0, 3.0, 6.0, 7.0, 2.5, 4.8, 1.3, 7.9, 2.9, 9.0, 3.6};
        long start = System.currentTimeMillis();
        boolean valid = validation(names, data);
        if (valid) {
            sortSales(names, data, 0, data.length - 1);
            printData(names, data);
            long finish = System.currentTimeMillis();
            System.out.println(finish - start);
        }
    }

    static int partition(String[] names, double[] data, int start, int end) {
        int pivot = end;   // Выбрать pivot
        int i = start - 1;
        for (int j= start; j<=end; j++) {   // Пройти по массиву от start до pivot
            if (data[j] <= data[pivot]) {   // Проверить, если элемент с индексом j меньше или равно элементу с индексом pivot
                i++;                        // Инкрементировать i;
                double temp = data[i];      // Ввести временные переменные типа double и String и произвести присвоение переменных
                data[i] = data[j];
                data[j] = temp;
                String tempStr = names[i];
                names[i] = names[j];
                names[j] = tempStr;
            }
        }
        return i;
    }

    public static void sortSales(String[] names, double[] data, int start, int end) {   // Быстрая сортировка
        if (start < end) {  // Выполнить пока элемент start меньше элемента end
            int pivot = partition(names, data, start, end);  // Результат метода pivot записать в переменную
            sortSales(names, data, start, pivot - 1);    // Рекурсивный вызов быстрой сортировки с передачей параметров
            sortSales(names, data, pivot + 1, end);      // для левого и правого массива
        }
    }

    public static boolean validation(String[] names, double[] data) {   /// Метод для первоначальной проверки условий ниже
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








