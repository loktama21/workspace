package com.fun.client;

import com.fun.Travel;

public class TravelClientArgs {
    public static void main(String[] args) {
        Travel travel = new Travel();
        travel.commandLineArgumentFirst("Austin", "2005", "2008");
        System.out.println(); //break line
        travel.commandLineArgumentSecond(12, "2023", "2024", "2025");
    }
}
