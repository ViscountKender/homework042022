package ru.gb.siyanov;

public class Dog extends Animals {
    public static int number;



    public Dog(int runMax, int swimMax, boolean run, boolean swim) {
        super(runMax, swimMax, run, swim);
        number ++;
    }



    @Override
    public void runPet(int pathLength) {
        if (getRunMax()>=pathLength && isRun()){
            System.out.println("Собака пробежала: " + pathLength);
        }else {
            System.out.println("Собака не пробежала");
        }


    }

    @Override
    public void swimPet(int pathLength) {
        if (getSwimMax()>=pathLength && isSwim()){
            System.out.println("Собака проплыла: " + pathLength);
        }else {
            System.out.println("Собака не проплыла");
        }


    }


}
