package com.company.FactoryMethodPattern;

public class GoCab implements Cab{

    private final Integer PASSENGER_COUNT = 4;
    private static Integer id = 10000;
    private String source;

    public Integer getPASSENGER_COUNT() {
        return PASSENGER_COUNT;
    }

    public static Integer getId() {
        return id;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    private String destination;
    @Override
    public void ride(String source, String destination) {
        this.source = source;
        this.destination = destination;
        System.out.println("Your billing will be in accordance to the GoCab rates");
        System.out.println("Your ride for Uber GOCab is instantiated");
        System.out.println("You will be riding from " + source + " to " + destination);
        System.out.println("You GoCab id is : " + this.id);
        this.id++;
    }

}
