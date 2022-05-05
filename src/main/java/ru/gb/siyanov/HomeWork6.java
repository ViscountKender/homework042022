package ru.gb.siyanov;

public class HomeWork6 {
    public static void main(String[] args) {

        Dog dog = new Dog(500,10,true,true);
        Cat cat = new Cat(200,0,true,false);
        dog.runPet(300);
        cat.runPet(150);
        dog.swimPet(8);
        cat.swimPet(6);
        System.out.println("Животных: " + Animals.number);
        System.out.println("Собак: " + Dog.number);
        System.out.println("Котов: " + Cat.number);






    }

}

