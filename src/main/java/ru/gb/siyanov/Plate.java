package ru.gb.siyanov;

public class Plate {
    public int food;
    public Plate(int food) {
        this.food = food;
    }


    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {

            food -= n;

    }
    public void increaseFood(int x){
        food += x;
    }



    public void info() {
        System.out.println("Еды в миске: " + food);

    }
}


