package com.company;

public interface MatOf {

    int add(int num1, int num2);

    int minus(int num1, int num2);

    int multiply(int num1, int num2);

    double divide(int num1, int num2);

    default int modul(int modulNum) {
        if (modulNum > 0) {
            return modulNum;
        } else return modulNum * -1;

    }
}

