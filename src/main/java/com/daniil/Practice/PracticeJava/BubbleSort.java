package com.daniil.Practice.PracticeJava;

public class BubbleSort {
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
        else {  //Выполнять в остальных случаях
            double temp = 0; //Вводим временные переменные st и temp
            String st = "";
            for (int i = 1; i < data.length; i++) { // Пройти по внешнему циклу (Цикл со счетчиком) от индекса один и до конца массива
                for (int j = 0; j < data.length - i; j++) { // Пройти по внутреннему циклу (Цикл со счетчиком) от индекса ноль и до индекса (длина массива вычесть i)
                    if (data[j] < data[j + 1]) { // Если элемент с индексом j меньше элемента с индексом j + 1, то
                        temp = data[j];  // присвоить временной переменной temp значение элемента с индексом j
                        data[j] = data[j + 1]; // присвоить значение переменной data с индексом j, значение переменной с индексом j + 1
                        data[j + 1] = temp; // присвоить значение переменной data с индексом j + 1, значение временной переменной temp
                        st = names[j]; // присвоить временной переменной st значение переменной с индексом j
                        names[j] = names[j + 1]; // присвоить значение переменной name с индексом j, значение переменной с индексом j + 1
                        names[j + 1] = st; // присвоить значение переменной name с индексом j + 1, значение временной переменной st

                        printData(names, data); // вызвать метод для отображения данных в консоль
                    }
                }
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
