package com.lecture1.homework;

public class Task2 {
    //main - спец исполняемый метод в джаве
    public static void main(String[] args) {
        String s1 = "We make work HUMAN.";
        String s2 = "Unlock full potential. Celebrate positive moments.";
        String s3 = "Every day.";
        final String LINE_BREAK_SYMBOL = "\n";

        //вывод в консоль текста
        //'\n' - символ перевода строки
        //print - просто выводит; println - с переводом строки
        System.out.println(s1 + LINE_BREAK_SYMBOL + s2 + LINE_BREAK_SYMBOL + s3 + LINE_BREAK_SYMBOL);

        //вывод длины 2й строки
        int len = s2.length();
        System.out.println("String 2 length is " + len + LINE_BREAK_SYMBOL);

        //перевод в нижний регистр
        System.out.println(s1.toLowerCase() + LINE_BREAK_SYMBOL + s2.toLowerCase() + LINE_BREAK_SYMBOL + s3.toLowerCase() + LINE_BREAK_SYMBOL);

        //замена е на E
        System.out.print(s1.replace('e', 'E') + LINE_BREAK_SYMBOL + s2.replace('e', 'E') + LINE_BREAK_SYMBOL + s3.replace('e', 'E') + LINE_BREAK_SYMBOL);
        System.out.print((s1+LINE_BREAK_SYMBOL+s2+LINE_BREAK_SYMBOL+s3).replace('e', 'E') );

    }
}
