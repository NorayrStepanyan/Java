package com.company;

public class Interfaceimplement implements MatOf {
    @Override
    public int add(int num1, int num2) {

        return modul(num1) + modul(num2);
    }

    @Override
    public int minus(int num1, int num2) {
        if (num1 > num2) return num1 - num2;
        else return num2 - num1;
    }

    @Override
    public int multiply(int num1, int num2) {
        return modul(num1 * num2);
    }

    @Override
    public double divide(int num1, int num2) {
        return num1 / num2;
    }
}
