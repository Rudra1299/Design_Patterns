package com.company.FactoryMethodPattern;

public class UberGoCabBooker extends UberCabBooker{

    public UberGoCabBooker(String name, String currentLoc, String dropLoc) {
        super(name, currentLoc ,dropLoc);
    }

    @Override
    protected Cab getCab() {
        return new GoCab();
    }
}
