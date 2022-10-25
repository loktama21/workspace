package com.fun.client;

import com.fun.Travel;
import com.fun.TravelType;

import java.time.LocalTime;

public class TravelClient {
    public static void main(String[] args) {

        Travel travel = new Travel("Austin",
                4, "2013",
                LocalTime.now().withNano(0),
                TravelType.DRIVING);
        travel.travelInfo();
        System.out.println(travel);

        System.out.println(); //break line

        Travel travel1 = new Travel();
        travel1.setTravelLocalTime(LocalTime.now());
        travel1.setNumberOfVisits(19);
        travel1.setTravelYear("2008");
        travel1.setFavoriteDestination("Seattle");
        travel1.setTravelType(TravelType.FLYING);
        travel1.travelInfo();
        System.out.println(travel1);
    }
}
