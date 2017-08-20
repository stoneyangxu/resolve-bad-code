package com.github.stoneyangxu;

public abstract class Clock {
    protected int utcOffset = 0;
    protected int localTime;

    public Clock(int utcOffSet) {
        this.utcOffset = utcOffSet;
    }

    public abstract void setLocalTime(int localTime);

    public void setLocalTimeFromUtcZeroTime(int utcZeroTime) {
        this.localTime = utcZeroTime + this.utcOffset;
    }

    public String getTime() {
        return String.valueOf(this.localTime);
    }
}
