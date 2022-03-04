
package com.company;

public enum Color {

    RED("#FF0000"),
    GREEN("#0000FF"),
    BLUE("#00FF00");

    private String colorCode;

    Color(String color) {
        colorCode = color;
    }

    public String returnColor() {
        return colorCode;
    }
}