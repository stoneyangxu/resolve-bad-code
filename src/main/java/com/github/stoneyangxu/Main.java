package com.github.stoneyangxu;

public class Main {

    public static void main(String[] args) {
        UtcTime utcTime = new UtcTime();
        utcTime.attach("Beijing", new CityClock(8));
        utcTime.attach("London", new CityClock(0));
        utcTime.attach("Moscow", new CityClock(4));
        utcTime.attach("Sydney", new CityClock(10));
        utcTime.attach("NewYork", new CityClock(-1));

        PhoneClock phoneClock = new PhoneClock(8);
        phoneClock.setUtcTime(utcTime);

        phoneClock.setLocalTime(9);

        utcTime.printTimeOfAllClocks();
    }
}
