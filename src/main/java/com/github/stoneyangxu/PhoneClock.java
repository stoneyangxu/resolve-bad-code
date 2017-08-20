package com.github.stoneyangxu;

public class PhoneClock extends Clock {

    private UtcTime utcTime;

    public PhoneClock(int utcOffSet) {
        super(utcOffSet);
    }

    @Override
    public void setLocalTime(int localTime) {
        super.localTime = localTime;
        this.utcTime.setUtcZeroTime(localTime - UTC_OFFSET);
    }

    public void setUtcTime(UtcTime utcTime) {
        this.utcTime = utcTime;
    }
}
