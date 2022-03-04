package com.company;

import java.util.ArrayList;

public class Sequence {

    int start;
    int end;

    Sequence(int start, int end) {
        this.start = start;
        this.end = end;
    }

    ArrayList<Integer> primeNumberList() {
        ArrayList<Integer> resultList = new ArrayList<>();
        return resultList;
    }

    ArrayList<Integer> collandprimeNumberList() {
        ArrayList<Integer> resultList = new ArrayList<>();
        return resultList;
    }

    int exeptionTestMethod(int firstNum, int secondNum) {
        try {
            return firstNum / secondNum;
        } catch (ArithmeticException e) {
            System.out.println("Pls return");
            return -1;
        }
    }

    void selectCase(int number) {
        switch (number) {
            case 10:
                System.out.println("number is 10");
                break;
            case 20:
                System.out.println("number is 20");
                break;
            case 30:
                System.out.println("number is 30");
                break;
            default:
                System.out.println("number is unknown");
                break;
        }
    }
    public interface Repair {
        int intervalOfRepair = 12;
        int priceOfRepair = 0;

        boolean engineUpdate();

        private int timeOfRepair() {
            return 10;
        }

        default int engineRepair() {
            return intervalOfRepair * 2 + timeOfRepair();
        }
    }

}
