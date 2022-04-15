package ru.gb.siyanov;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String line = "Текст";
        System.out.println("Задание №1" + checkSum(a,b));
        numberSign( a);
        System.out.println("Задание №3" + examinationNumbers( b));
        printingWords(a,line);


    }

    // Задание 1
    public static boolean checkSum(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }

    }

    // Задание 2
    public static void numberSign(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }

    }

    // Задание 3
    public static boolean examinationNumbers(int b) {
        if (b < 0) {
            return true;

        } else {
            return false;
        }

    }

    // задание 4
    public static void printingWords(int b, String line) {
        for (int i = 0; i < b; i++) {
            System.out.println(line);
        }

    }
    // Задание 5


}

