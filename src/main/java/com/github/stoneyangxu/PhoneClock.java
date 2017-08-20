package com.github.stoneyangxu;

public class PhoneClock extends Clock {

    private HotelWorldClockSystem hotelWorldClockSystem;

    public PhoneClock(int utcOffSet) {
        super(utcOffSet);
    }

    public void setTime(int time) {
        for (CityClock cityClock : this.hotelWorldClockSystem.getClocks()) {
            cityClock.setUtcZeroTime(time - this.utcOffSet);
        }
    }

    public void setHotelWorldClockSystem(HotelWorldClockSystem hotelWorldClockSystem) {
        this.hotelWorldClockSystem = hotelWorldClockSystem;
    }
}
