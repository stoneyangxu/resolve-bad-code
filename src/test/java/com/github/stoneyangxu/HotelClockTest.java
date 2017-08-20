package com.github.stoneyangxu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelClockTest {

    @Test
    public void itWillBe1InLondonWhenItIs9InBeijing() {
       CityClock londonClock = new CityClock(0);

       PhoneClock phoneClock = new PhoneClock(8);
       phoneClock.setCityClock(londonClock);
       phoneClock.setTime(9); // TODO set clock to multiple city clocks§

       assertEquals(1, londonClock.getTime());
    }
}
