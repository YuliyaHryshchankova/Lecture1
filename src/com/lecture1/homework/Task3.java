package com.lecture1.homework;

public class Task3 {
    public static void main(String args[]) {
        //создание массива символов
        char[] globoforceArray = {'G', 'l', 'o', 'b', 'o', 'f', 'o', 'r', 'c', 'e'};

        //создание строки из массива символов
        String globoforceString = new String(globoforceArray);
        System.out.println(globoforceString + "\n");

        //выводит размер массива
        System.out.println("Array size is " + globoforceArray.length + "\n");

        //замена b на $
        //проверяет первый символ, если b, то меняет на $, если нет, то переходит к след (n++ - это n+1) и т.д.
        // И так до тех пор, пока не достигнет длины массива. Как только достигнет (n=9), то выйдет из цикла
        for (int n = 0; n < globoforceArray.length; n++) {
            if (globoforceArray[n] == 'b')
                globoforceArray[n] = '$';
        }
        //вывод с заменой b на $
        System.out.println(globoforceArray);
    }
}
