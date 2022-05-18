package ru.gb.siyanov;

import java.util.Scanner;

public class MainClass {
    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
       // Plate p = new Plate();
        int action;


        Cat [] arrayCat = new Cat[5];
        arrayCat[0] = new Cat("Barsik", 5, false);
        arrayCat[1] = new Cat("Pushock", 7,false);
        arrayCat[2] = new Cat("Black", 8, false);
        arrayCat[3] = new Cat("Carmelina", 4,false);
        arrayCat[4] = new Cat("Tiger", 9,false);

        Plate plate = new Plate( 100);
        plate.info();
        for (int i = 0; i < arrayCat.length; i++) {
            if(arrayCat[i].satiety==false && arrayCat[i].appetite <= plate.food) {
                arrayCat[i].eat(plate);
                arrayCat[i].satiety = true;
                System.out.println("Кот " + arrayCat[i].name + " поел");
            } else {
                System.out.println("Кот " + arrayCat[i].name + " остался голодным");
            }

        }
        plate.info();
        System.out.println("Сколько еды нужно добавить в миску ?" );
        action = sc.nextInt();
        plate.increaseFood (action);
        plate.info();

        

    }


}
