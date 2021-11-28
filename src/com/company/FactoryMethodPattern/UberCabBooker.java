package com.company.FactoryMethodPattern;

public abstract class UberCabBooker {

    private static Integer bookID = 1;
    private String name;
    private String currentLoc;
    private String dropLoc;

    public UberCabBooker (String name, String currentLoc, String dropLoc){
        this.name = name;
        this.currentLoc = currentLoc;
        this.dropLoc = dropLoc;
    }

    public void bookingService() {
        System.out.println("Booking the cab.....");
        Cab cab = this.getCab();
        cab.ride(currentLoc, dropLoc);
    }

     protected abstract Cab getCab();
}
