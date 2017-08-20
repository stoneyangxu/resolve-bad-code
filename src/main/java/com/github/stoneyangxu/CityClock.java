package com.github.stoneyangxu;

public class CityClock {
    private final int utcOffSet;
    private int time;

    public CityClock(int utcOffSet) {
        this.utcOffSet = utcOffSet;
    }

    public int getTime() {
        return time;
    }
}
