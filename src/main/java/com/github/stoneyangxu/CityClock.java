package com.github.stoneyangxu;

public class CityClock extends Clock {
    private int utcZeroTime;

    public CityClock(int utcOffSet) {
        super(utcOffSet);
    }

    @Override
    public int getTime() {
        return (this.utcZeroTime + this.utcOffSet + 24) % 24;
    }

    public void setUtcZeroTime(int utcZeroTime) {
        this.utcZeroTime = utcZeroTime;
    }
}
