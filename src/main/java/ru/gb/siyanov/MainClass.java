package ru.gb.siyanov;

public class MainClass {
    public static void main(String[] args) {

        Cat [] arrayCat = new Cat[5];
        arrayCat[0] = new Cat("Barsik", 5, false);
        arrayCat[1] = new Cat("Pushock", 7,false);
        arrayCat[2] = new Cat("Black", 8, false);
        arrayCat[3] = new Cat("Carmelina", 4,false);
        arrayCat[4] = new Cat("Tiger", 9,false);

        Plate plate = new Plate( 5);
        for (int i = 0; i < arrayCat.length; i++) {
            plate.info();
            arrayCat[i].eat(plate);

        }

        

    }


}
