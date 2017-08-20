package com.github.stoneyangxu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelClockTest {

    @Test
    public void itWillBe1InLondonWhenItIs9InBeijing() {
        CityClock londonClock = new CityClock(0);

        HotelWorldClockSystem hotelWorldClockSystem = new HotelWorldClockSystem();
        hotelWorldClockSystem.attach(londonClock);

        PhoneClock phoneClock = new PhoneClock(8);
        phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
        phoneClock.setTime(9);

        assertEquals(1, londonClock.getTime());
    }

    @Test
    public void itWillBe20InNewYorkWhenItIs9InBeijing() {
        CityClock newYorkClock = new CityClock(-5);

        HotelWorldClockSystem hotelWorldClockSystem = new HotelWorldClockSystem();
        hotelWorldClockSystem.attach(newYorkClock);

        PhoneClock phoneClock = new PhoneClock(8);
        phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
        phoneClock.setTime(9);

        assertEquals(20, newYorkClock.getTime());
    }

    @Test
    public void updateMultipleCityClocks() throws Exception {

        CityClock londonClock = new CityClock(0);
        CityClock newYorkClock = new CityClock(-5);

        HotelWorldClockSystem hotelWorldClockSystem = new HotelWorldClockSystem();
        hotelWorldClockSystem.attach(londonClock);
        hotelWorldClockSystem.attach(newYorkClock);

        PhoneClock phoneClock = new PhoneClock(8);
        phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
        phoneClock.setTime(9);

        assertEquals(1, londonClock.getTime());
        assertEquals(20, newYorkClock.getTime());
    }

    @Test
    public void phoneClockShouldHaveRightTime() throws Exception {
        PhoneClock phoneClock = new PhoneClock(8);
        phoneClock.setTime(9);

        assertEquals(9, phoneClock.getTime());

    }
}
