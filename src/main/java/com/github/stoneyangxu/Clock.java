package com.github.stoneyangxu;

public abstract class Clock {
    protected final int utcOffSet;

    public Clock(int utcOffSet) {
        this.utcOffSet = utcOffSet;
    }

    public abstract int getTime();
}
