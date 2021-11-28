package com.company.BuilderPattern;

import com.sun.source.tree.AssignmentTree;

import java.util.List;

public class SamsungUIBuilder implements AppUIBuilder{
    private Date date;
    private SearchEngine searchEngine;
    private List<String> icons;
    private Assistant assistant;

    @Override
    public void setDate(Date date) {
        this.date = date;
        System.out.println("This is method for setting date in samsung UI");
        System.out.println("The alignment of the date is right");
        System.out.println(this.date.toString());
    }

    @Override
    public void setSearchEngine(SearchEngine searchEngine) {
        this.searchEngine = searchEngine;
        System.out.println("This is the method for setting search engine");
        System.out.println("The aligment is center");
        System.out.println(searchEngine.getName());
    }

    @Override
    public void setIcons(List<String> icons) {
        this.icons = icons;
        System.out.println("This is the method for displaying icons");
        System.out.println("The series of icons will be displayed from left to right with medium size each");
        for(String icon : icons) {
            System.out.println(icon + ' ');
        }
    }

    public void setAssistant(Assistant assistant) {
        this.assistant = assistant;
        System.out.println("This is the method for setting assistant");
        System.out.println("The alignment is the bottom here home button");
        this.assistant.turnOn();
    }

    public SamsungUI getProduct() {
        return new SamsungUI(date, searchEngine, icons, assistant);
    }

}
