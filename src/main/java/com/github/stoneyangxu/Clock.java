package com.github.stoneyangxu;

public abstract class Clock {
    protected static int UTC_OFFSET = 0;
    protected int localTime;

    public Clock(int utcOffSet) {
        UTC_OFFSET = utcOffSet;
    }

    public abstract void setLocalTime(int localTime);

    public static int toLocalTime(int utcZeroTime) {
        return utcZeroTime + UTC_OFFSET;
    }

    public String getTime() {
        return String.valueOf(this.localTime);
    }
}
