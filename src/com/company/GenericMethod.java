package com.company;

public class GenericMethod {
    public <T> void sum(T a) {

        if (Integer.class.equals(a.getClass())) {
            System.out.println((int) a );
        } else if (Double.class.equals(a.getClass())) {
            double num = (double) a;
            System.out.println(num * num);
        } else
            System.out.println(a.toString());
    }
}
