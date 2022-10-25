package com.fun.test;

import com.fun.Travel;

public class TravelValidationTest {
    public static void main(String[] args) {
        Travel travel = new Travel();

        travel.setNumberOfVisits(25);
        int numberOfVisit = travel.getNumberOfVisits();
        System.out.println("Number of visits: " + numberOfVisit);

        System.out.println();//break line

        travel.setNumberOfVisits(102);
        int numberOfVisit1 =  travel.getNumberOfVisits();
        System.out.println("Number of visits: " + numberOfVisit1);
    }
}
