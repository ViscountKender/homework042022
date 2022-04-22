package ru.gb.siyanov;

import java.util.Arrays;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        // задание 1
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
        // задание 2
        int hundred[] = new int[100];
        for (int i = 0; i < hundred.length; i++) {
            hundred[i]=i+1;

        }
        System.out.println(Arrays.toString(hundred));
        //Задание 3






    }





}


