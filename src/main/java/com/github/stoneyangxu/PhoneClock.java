package com.github.stoneyangxu;

public class PhoneClock {

    private final int utcOffSet;
    private int time;

    public PhoneClock(int utcOffSet) {
        this.utcOffSet = utcOffSet;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
