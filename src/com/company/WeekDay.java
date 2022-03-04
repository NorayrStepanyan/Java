package com.company;

public enum WeekDay {

    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);

    private boolean free;

    WeekDay(boolean freeDay) {
        free = freeDay;
    }

    boolean getFreeDay() {
        return free;
    }
}
