package com.company;

import java.util.ArrayList;

public class Computer {

    private int ram;
    private int cpu;
    private boolean gpu = false;
    private int monthlyInterestRate;

    Computer(int ram, boolean gpu, int cpu) {
        this.ram = ram;
        this.gpu = gpu;
        this.cpu = cpu;
    }

    public int priceOfComp() {
        if (gpu) {
            return this.ram * 3000 + this.cpu * 5000 + 30000;
        } else {
            return this.ram * 3000 + this.cpu * 5000;
        }
    }

    public int interestRate(int monthlyInterestRate) {
        int inPrice;
        this.monthlyInterestRate = monthlyInterestRate;

        return inPrice = priceOfComp() * 18 / 100 * monthlyInterestRate;

    }
}