package com.github.stoneyangxu;

public class UtcTime extends TimeSubject {
    public int getUtcZeroTime() {
        return utcZeroTime;
    }

    public void setUtcZeroTime(int utcZeroTime) {
        this.utcZeroTime = utcZeroTime;
        notifyAllClocks();
    }

    private int utcZeroTime;

    @Override
    public void notifyAllClocks() {
        for (Clock clock : super.clocks.values()) {
            clock.setLocalTimeFromUtcZeroTime(this.utcZeroTime);
        }
    }
}
