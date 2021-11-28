package com.company.BuilderPattern;

import java.util.List;

public class OnePlusUIBuilder implements AppUIBuilder {

    private Date date;
    private SearchEngine searchEngine;
    private List<String> icons;

    @Override
    public void setDate(Date date) {
        this.date = date;
        System.out.println("This is method for setting date in samsung UI");
        System.out.println("The alignment of the date is left");
        System.out.println(this.date.toString());
    }

    @Override
    public void setSearchEngine(SearchEngine searchEngine) {
        this.searchEngine = searchEngine;
        System.out.println("This is the method for setting search engine");
        System.out.println("The aligment is bottomed center");
        System.out.println(searchEngine.getName());
    }

    @Override
    public void setIcons(List<String> icons) {
        this.icons = icons;
        System.out.println("This is the method for displaying icons");
        System.out.println("The series of icons will be displayed from left to right with larger size each");
        for(String icon : icons) {
            System.out.println(icon + ' ');
        }
    }

    public OnePlusUI getProduct() {
        return new OnePlusUI(date, searchEngine, icons);
    }
}
