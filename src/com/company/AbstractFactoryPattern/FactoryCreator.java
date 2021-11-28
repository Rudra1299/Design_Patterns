package com.company.AbstractFactoryPattern;

public class FactoryCreator {

    public enum ServiceType {
        WEB, MOBILE
    }

    public static MessengerFactory makeFactory(ServiceType type) throws IllegalArgumentException{
        switch (type) {
            case WEB: {
                return new WebMessengerFactory();
            }
            case MOBILE: {
                return new MobileMessengerFactory();
            }
            default:
                throw new IllegalArgumentException("Type not supported.");
        }
    }
}
