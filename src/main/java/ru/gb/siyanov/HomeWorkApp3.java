package ru.gb.siyanov;

import java.util.Arrays;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        // задание 1
        System.out.println("Задание № 1");
        int[] array = {1, 0, 0, 0, 1, 1, 0, 1, 0, 0};

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if(array[i] == 0) {
                array[i] = 1;
            }else{
                array[i]=0;
            }

        }
        System.out.println(Arrays.toString(array));
        System.out.println("Задание №2");

        // задание 2
        int hundred[] = new int[100];
        for (int i = 0; i < hundred.length; i++) {
            hundred[i]=i+1;

        }
        System.out.println(Arrays.toString(hundred));
        System.out.println("Задание №3");
        // задание 3
        int[] list = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplicationInAnArray(list);
        System.out.println("Задание № 4");



        // задание 4

        int arr[][] = new int[6][6];

        diagonalArray(arr);

        }
    public static void multiplicationInAnArray(int[] list){
        System.out.println(Arrays.toString(list));

        for (int i = 0; i < list.length; i++) {
            if(list[i]<6){
                list[i]=list[i] * 2;
            }

        }
        System.out.println(Arrays.toString(list));

    }

    public static void diagonalArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i==j){
                    arr[i][j]=1;
                }
                if ((arr.length)-1 == i +j){
                    arr[i][j]=1;
                }
                System.out.printf("%2d ", + arr[i][j]);

            }
            System.out.println();


        }



    }






}


