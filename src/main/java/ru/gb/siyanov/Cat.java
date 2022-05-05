package ru.gb.siyanov;

public class Cat extends Animals {
    public static int number;
    public Cat(int runMax, int swimMax, boolean run, boolean swim) {
        super(runMax, swimMax, run, swim);
        number ++;
    }
    @Override
    public void runPet(int pathLength) {
        if (getRunMax()>=pathLength && isRun()){
            System.out.println("Кошка пробежала: " + pathLength);
        }else {
            System.out.println("Кошка не пробежала");
        }


    }

    @Override
    public void swimPet(int pathLength) {
        if (getSwimMax()>=pathLength && isSwim()){
            System.out.println("Кошка проплыла: " + pathLength);
        }else {
            System.out.println("Кошка не проплыла");
        }


    }
}

