package com.github.stoneyangxu;

public abstract class Clock {
    protected static int UTC_OFFSET = 0;
    protected int localTime;

    public abstract void setLocalTime(int localTime);

    public static int toLocalTime(int utcZeroTime) {
        return utcZeroTime + UTC_OFFSET;
    }
}
