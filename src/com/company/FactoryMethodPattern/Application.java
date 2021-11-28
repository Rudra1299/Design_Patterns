package com.company.FactoryMethodPattern;

public class Application {
    public static void main(String[] args) {
        String username = "Stephinie";
        String currentLoc = "California";
        String destLoc = "Seattle";

        String cab = "GoSedanCab";
        if(cab.equals("GoCab")) {
            UberCabBooker uberCabBooker = new UberGoCabBooker(username, currentLoc, destLoc);
            uberCabBooker.bookingService();
        }
        else {
            UberCabBooker uberCabBooker = new UberGoSedanCabBooker(username, currentLoc, destLoc);
            uberCabBooker.bookingService();
        }

     }
}
