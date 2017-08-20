package com.github.stoneyangxu;

import java.util.ArrayList;
import java.util.List;

public class HotelWorldClockSystem {

    private List<CityClock> clocks = new ArrayList<>();

    public void attach(CityClock cityClock) {
        this.clocks.add(cityClock);
    }

    public List<CityClock> getClocks() {
        return clocks;
    }
}
