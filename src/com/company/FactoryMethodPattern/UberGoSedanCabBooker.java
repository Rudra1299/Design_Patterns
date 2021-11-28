package com.company.FactoryMethodPattern;

public class UberGoSedanCabBooker extends UberCabBooker{

    public UberGoSedanCabBooker(String name, String currentLoc, String destLoc) {
        super(name, currentLoc, destLoc);
    }

    @Override
    protected Cab getCab() {
        return new GoSedanCab();
    }
}
