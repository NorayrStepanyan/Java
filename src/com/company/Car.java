package com.company;

abstract class Transport {
    abstract void isBreak();

    void motion() {
        System.out.println("gooooooooo");
    }
}

public class Car extends Transport {
    public static int count = 0;
    private String company;
    private String model;
    private int winCode = 0;
    private String color;

    Car(int winCode) {
        this.winCode = winCode;
        count++;
    }

    Car(int winCode, String model) {
        this.winCode = winCode;
        this.model = model;
        count++;
    }

    Car(String model) {
        this.model = model;
        count++;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public int getWinCode(String password) {
        if (password.equals("1111")) {
            return this.winCode;
        } else {
            return -1;
        }

    }

    public void setWinCode(int winCode) {
        if (winCode > 0) {
            this.winCode = winCode;
        }

    }

    void isBreak() {
        System.out.println(this.model + " is breaking");
    }

    int isBreak(int vel) {
        System.out.println(this.model + " is breaking with velocity" + vel);
        int temp = 1;
        temp += vel;
        return temp;
    }

    double isBreak(int vel, int time) {
        return 10.2;
    }
}
