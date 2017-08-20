package com.github.stoneyangxu;

public class CityClock extends Clock {
    public CityClock(int utcOffSet) {
        super(utcOffSet);
    }

    @Override
    public void setLocalTime(int localTime) {
        super.localTime = localTime;
    }
}
