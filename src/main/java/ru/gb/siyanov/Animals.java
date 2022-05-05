package ru.gb.siyanov;

public  class Animals {
    private int runMax;
    private int swimMax;
    private boolean run;
    private boolean swim;
    public static int number;


    public Animals(int runMax, int swimMax, boolean run, boolean swim) {
        this.runMax = runMax;
        this.swimMax = swimMax;
        this.run = run;
        this.swim = swim;
        number ++;
    }

    public int getRunMax() {
        return runMax;
    }

    public int getSwimMax() {
        return swimMax;
    }

    public boolean isRun() {
        return run;
    }

    public boolean isSwim() {
        return swim;
    }
    public  void runPet(int pathLength){

    }



    public  void swimPet(int pathLength){

    };

}


