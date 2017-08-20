package com.github.stoneyangxu;

public class PhoneClock {

    private final int utcOffSet;
    private CityClock cityClock;
    private HotelWorldClockSystem hotelWorldClockSystem;

    //TODO the constructor of PhoneClock and CityClock are duplicated
    public PhoneClock(int utcOffSet) {
        this.utcOffSet = utcOffSet;
    }

    public void setTime(int time) {
        for (CityClock cityClock : this.hotelWorldClockSystem.getClocks()) {
            cityClock.setUtcZeroTime(time - this.utcOffSet);
        }
    }

    public void setCityClock(CityClock cityClock) {
        this.cityClock = cityClock;
    }

    public void setHotelWorldClockSystem(HotelWorldClockSystem hotelWorldClockSystem) {
        this.hotelWorldClockSystem = hotelWorldClockSystem;
    }
}
