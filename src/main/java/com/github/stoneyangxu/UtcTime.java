package com.github.stoneyangxu;

public class UtcTime extends TimeSubject {
    private int utcZeroTime;

    @Override
    public void notifyAllClocks() {
        for (Clock clock : super.clocks.values()) {
            clock.setLocalTime(Clock.toLocalTime(this.utcZeroTime));
        }
    }
}
