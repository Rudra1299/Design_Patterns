package com.company.BuilderPattern;

public class Date {
    private Integer day;
    private Integer month;
    private Integer year;

    public Date(Integer day, Integer month, Integer year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return day + " - " + month + " - " + year;
    }
}
