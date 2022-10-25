package com.entertainment.client;

public class TelevisionClient {
    public static void main(String[] args) {
        Television tv1 = new Television();

        tv1.setBrand("Samsung");
        tv1.setVolume(80);

        tv1.getBrand();
        tv1.getVolume();

        tv1.turnOn();
        tv1.turnOff();

        System.out.println(tv1);
    }
}
