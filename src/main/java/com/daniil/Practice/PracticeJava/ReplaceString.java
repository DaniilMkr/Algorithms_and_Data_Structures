package com.daniil.Practice.PracticeJava;

import java.util.Arrays;

public class ReplaceString {

    public static void main(String[] args) {
        String output = replace(Arrays.toString(args));
        System.out.println(output);

    }


    public static String replace(String s) {
        if (s == null) {   // Если строка равна null, то вывести строка не существует
            return "Not exist";
        } else if (s.equals("")) {
            return "Empty String"; // Если строка пустая, вывести Empty String
        } else {
            char[] inputString = s.toCharArray(); // Преобразование строки в массив типа char
            char[] outputString;
            int count = 0;
            for (char c : inputString) { // Пройти по массиву и определить длинну нового массива исключая символ '*'
                if (c != '*') {
                    count = count + 1;
                }
            }
            outputString = new char[count]; // Инициализация массива длинной определенной ранее.
            int temp = 0;  // Временная переменная для отслеживания индекса
            for (int i = 0; i < inputString.length && count > temp; i++) { // Выполнять пока не дойдем до конца массива или count > temp
                if (inputString[i] != '*') {     // Если символ не "*" , то добавить элемент в массив outputString
                    outputString[temp] = inputString[i];
                    temp++;

                }
            }
            return new String(outputString); // Передать в конструктор массив outputString и возвратить строку
        }
    }
}
