package com.github.stoneyangxu;

public abstract class Clock {
    protected int UTC_OFFSET;
    protected int localTime;

    public abstract void setLocalTime(int localTime);
}
