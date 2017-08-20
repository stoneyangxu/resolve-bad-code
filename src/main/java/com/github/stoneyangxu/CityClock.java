package com.github.stoneyangxu;

public class CityClock {
    private final int utcOffSet;
    private int utcZeroTime;

    public CityClock(int utcOffSet) {
        this.utcOffSet = utcOffSet;
    }

    public int getTime() {
        return (this.utcZeroTime + this.utcOffSet + 24) % 24;
    }

    public void setUtcZeroTime(int utcZeroTime) {
        this.utcZeroTime = utcZeroTime;
    }
}
