package ru.gb.siyanov;

import java.util.Arrays;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        // задание 1
//        int[] array = {1, 0, 0, 0, 1, 1, 0, 1, 0, 0};
//
//        System.out.println(Arrays.toString(array));
//
//        for (int i = 0; i < array.length; i++) {
//            if(array[i] == 0) {
//                array[i] = 1;
//            }else{
//                array[i]=0;
//            }
//
//        }
//        System.out.println(Arrays.toString(array));
//        // задание 2
//        int hundred[] = new int[100];
//        for (int i = 0; i < hundred.length; i++) {
//            hundred[i]=i+1;
//
//        }
//        System.out.println(Arrays.toString(hundred));
//
//        // задание 4
//
        int arr[][] = new int[6][6];

        diagonalArray( arr);

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


