package com.fun;

import com.fun.test.IllegalTravelException;

import java.time.LocalTime;

public class Travel {
    private String favoriteDestination;
    private int numberOfVisits;
    private String travelYear;
    private LocalTime travelLocalTime;
    TravelType travelType;
    public static final int MAX_DESTINATIONS_TRAVELLED_YEARLY = 100;
    public static final int MIN_DESTINATIONS_TRAVELLED_YEARLY = 0;

    public Travel() {
    }

    public Travel(String favoriteDestination) {
        this.favoriteDestination = favoriteDestination;
    }

    public Travel(String favoriteDestination, int numberOfVisitedDestinations,
                  String travelledYear, LocalTime travelLocalTime, TravelType travelType) {
        this(favoriteDestination);
        setNumberOfVisits(numberOfVisitedDestinations);
        setTravelYear(travelledYear);
        setTravelLocalTime(travelLocalTime);
        setTravelType(travelType);
    }

    public void travelInfo() {
        System.out.println("I love " + getTravelType() + " and I visited "
                + getNumberOfVisits() + " different cities in " +
                getTravelYear() + ". My favorites was "
                + getFavoriteDestination() + ".");
    }

    public static void commandLineArgumentFirst(String myFavoriteDestinations
            , String... myTravelledYears) {
        for (String myTravelledYear : myTravelledYears) {
            System.out.println("I travelled " + myFavoriteDestinations
                    + " in " + myTravelledYear + ".");
        }
    }

    public void commandLineArgumentSecond(int myVisits
            , String... myTravelledYears) {
        setNumberOfVisits(myVisits);
        int numberOfVisits = getNumberOfVisits();
        for (String myTravelledYear : myTravelledYears) {
            System.out.println("I plan to travel  " + numberOfVisits
                    + " different cities in " + myTravelledYear + ".");
            numberOfVisits = numberOfVisits + 3;
        }
    }

    public String getFavoriteDestination() {
        return favoriteDestination;
    }

    public void setFavoriteDestination(String favoriteDestination) {
        this.favoriteDestination = favoriteDestination;
    }

    public int getNumberOfVisits() {
        return numberOfVisits;
    }

    public void setNumberOfVisits(int visits) {
        if (visits >= this.MAX_DESTINATIONS_TRAVELLED_YEARLY
                || visits <= this.MIN_DESTINATIONS_TRAVELLED_YEARLY) {
            throw new IllegalTravelException(visits + " is an INVALID number of visits.");
        }else {
            this.numberOfVisits = visits;
        }
    }

    public String getTravelYear() {
        return travelYear;
    }

    public void setTravelYear(String travelYear) {
        this.travelYear = travelYear;
    }

    public LocalTime getTravelLocalTime() {
        return travelLocalTime;
    }

    public void setTravelLocalTime(LocalTime travelLocalTime) {
        this.travelLocalTime = travelLocalTime;
    }

    public TravelType getTravelType() {
        return travelType;
    }

    public void setTravelType(TravelType travelType) {
        this.travelType = travelType;
    }

    @Override
    public String toString() {
        return "Travel = {" +
                "favoriteDestination = '" + favoriteDestination + '\'' +
                ", numberOfVisits = " + numberOfVisits +
                ", travelType = " + travelType +
                ", travelLocalTime=" + travelLocalTime +
                ", travelYear='" + travelYear + '\'' +
                '}';
    }
}
