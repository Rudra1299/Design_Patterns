package com.company.BuilderPattern;

public class Assistant {
    private String name;
    private boolean started;
    public Assistant(String name) {
        this.name = name;
    }

    public void turnOn() {
        System.out.println("your assistant is turned on");
        started = true;
    }

    public String getName() {
        return name;
    }

    public boolean isStarted() {
        return started;
    }

    public void turnOff() {
        System.out.println("your assistant is turned off");
        started = false;
    }
}
