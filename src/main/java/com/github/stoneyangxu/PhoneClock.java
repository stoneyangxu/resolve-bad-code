package com.github.stoneyangxu;

public class PhoneClock extends Clock {

    private HotelWorldClockSystem hotelWorldClockSystem;
    private int time;

    public PhoneClock(int utcOffSet) {
        super(utcOffSet);
    }

    @Override
    public int getTime() {
        return this.time;
    }

    public void setTime(int time) {
        this.time = time;
        if (this.hotelWorldClockSystem == null) {
            return;
        }
        for (CityClock cityClock : this.hotelWorldClockSystem.getClocks()) {
            cityClock.setUtcZeroTime(time - this.utcOffSet);
        }
    }

    public void setHotelWorldClockSystem(HotelWorldClockSystem hotelWorldClockSystem) {
        this.hotelWorldClockSystem = hotelWorldClockSystem;
    }

}
