package com.lecture1.homework;

public class Task2 {
    //main - спец исполняемый метод в джаве
    public static void main(String[] args) {
        String s1 = "We make work HUMAN.";
        String s2 = "Unlock full potential. Celebrate positive moments.";
        String s3 = "Every day.";

        //вывод в консоль текста
        //'\n' - символ перевода строки
        //print - просто выводит; println - с переводом строки
        System.out.println(s1 + "\n" + s2 + "\n" + s3 + "\n");

        //вывод длины 2й строки
        int len = s2.length();
        System.out.println("String 2 length is " + len + "\n");

        //перевод в нижний регистр
        System.out.println(s1.toLowerCase() + "\n" + s2.toLowerCase() + "\n" + s3.toLowerCase() + "\n");

        //замена е на E
        System.out.print(s1.replace('e', 'E') + "\n" + s2.replace('e', 'E') + "\n" + s3.replace('e', 'E'));
    }
}
