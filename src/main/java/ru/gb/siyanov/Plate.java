package ru.gb.siyanov;

public class Plate {
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        for (int i = 0; i < food; i++) {
            food -= n;

        }

        }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    private int food;

    public void info() {
        System.out.println("Еды в миске: " + food);

    }
}

//if (n >= 0 && food >= n) {
//        food -= n;
//        } else if ( food <= 0){
//        System.out.println("Кот голодный");
//        }
//
//        }
