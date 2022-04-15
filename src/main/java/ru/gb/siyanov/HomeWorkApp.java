package ru.gb.siyanov;

public class HomeWorkApp {
    public static void printThreeWords (){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign(){
        int a = 10;
        int b = 20;
        if (a + b >= 0 ){
            System.out.println("Сумма положительная");

        }else {
            System.out.println("Сумма отрицательная");

        }

    }
    public static void printColor (){
        int value = -100;
        if (0 >= value){
            System.out.println("Красный");

        }
        else if (0 < value && value <=100 ){
            System.out.println("Желтый");

        }
        else {
            System.out.println("Желтый");

        }

    }
    public static void compareNumbers(){
        int a = 200;
        int b = -5;
        if (a >= b){
            System.out.println("a >= b");

        }
        else {
            System.out.println("a < b");
        }

    }

    public static void main(String[] args) {
        printThreeWords ();
        checkSumSign();
        printColor ();
        compareNumbers();

    }
}
