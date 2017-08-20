package com.github.stoneyangxu;

public class PhoneClock extends Clock {

    private UtcTime utcTime;

    @Override
    public void setLocalTime(int localTime) {
        super.localTime = localTime;
        this.utcTime.setUtcZeroTime(localTime - UTC_OFFSET);
    }
}
