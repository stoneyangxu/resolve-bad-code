package com.github.stoneyangxu;

public class PhoneClock extends Clock {

    private UtcTime utcTime;

    public PhoneClock(int utcOffSet) {
        super(utcOffSet);
    }

    @Override
    public void setLocalTime(int localTime) {
        super.localTime = localTime;
        this.utcTime.setUtcZeroTime(localTime - utcOffset);
    }

    public void setUtcTime(UtcTime utcTime) {
        this.utcTime = utcTime;
    }
}
