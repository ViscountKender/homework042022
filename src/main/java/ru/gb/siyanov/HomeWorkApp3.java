package ru.gb.siyanov;

import java.util.Arrays;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        // задание 1
        System.out.println("Задание № 1");
        int[] array = {1, 0, 0, 0, 1, 1, 0, 1, 0, 0};

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }

        }
        System.out.println(Arrays.toString(array));
        // задание 2
        System.out.println("Задание №2");

        int[] hundred = new int[100];
        for (int i = 0; i < hundred.length; i++) {
            hundred[i] = i + 1;
        }
        System.out.println(Arrays.toString(hundred));

        // задание 3
        System.out.println("Задание №3");
        int[] list = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplicationInAnArray(list);

        // задание 4
        System.out.println("Задание № 4");

        int[][] arr = new int[6][6];
        diagonalArray(arr);
        //задание 5

        System.out.println("Задание № 5");
        int len = 10;
        int initialValue = 2;

        System.out.println(Arrays.toString(arrayByGivenVariables(len, initialValue)));

        System.out.println("Задание № 6");

        // задание 6
        int[] d = new int[6];
        minimumAndMaximum(d);

    }

    //задание 3
    public static void multiplicationInAnArray(int[] list) {
        System.out.println(Arrays.toString(list));

        for (int i = 0; i < list.length; i++) {
            if (list[i] < 6) {
                list[i] = list[i] * 2;
            }

        }
        System.out.println(Arrays.toString(list));

    }

    // задание 4
    public static void diagonalArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                if ((arr.length) - 1 == i + j) {
                    arr[i][j] = 1;
                }
                System.out.printf("%2d ", +arr[i][j]);

            }
            System.out.println();


        }

    }
    // задание №5

    public static int[] arrayByGivenVariables(int len, int initialValue) {
        int[] ar = new int[len];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = initialValue;
        }
        return ar;

    }

    // задание 6
    public static void minimumAndMaximum(int[] d) {
        for (int i = 0; i < d.length; i++) {
            d[i] = (int) (Math.random() * 10);

        }
        int max = d[0];
        int min = d[0];
        System.out.println(Arrays.toString(d));
        System.out.println();
        for (int j : d) {
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;

            }

        }
        System.out.println("максимальное число: " + max);
        System.out.println("Минимальное число: " + min);

    }

    //задание 7
    //public static boolean sumOfTheNumbersInTheArray(int[] b){


   // }






}



