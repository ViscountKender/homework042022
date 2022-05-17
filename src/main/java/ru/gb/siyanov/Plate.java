package ru.gb.siyanov;

public class Plate {
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        if (n >= 0 && food > n ) {
            food -= n;

        }
    }

    private int food;

    public void info() {
        System.out.println("Еды в миске: " + food);

    }
}


