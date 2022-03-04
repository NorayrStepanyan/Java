package com.company;

public class Generic<T, E> {
    private T number;
    private E check;

    public Generic(T number, E check) {
        this.number = number;
        this.check = check;
    }

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }

    public E isCheck() {
        return check;
    }

    public void setCheck(E check) {
        this.check = check;
    }
}
