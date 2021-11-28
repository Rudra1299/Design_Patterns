package com.company.BuilderPattern;

import java.util.List;

public class OnePlusUI {
    private Date date;
    private  SearchEngine searchEngine;
    private List<String> icons;

    public OnePlusUI(Date date, SearchEngine searchEngine, List<String> icons) {
        this.date = date;
        this.searchEngine = searchEngine;
        this.icons = icons;
    }

    public Date getDate() {
        return date;
    }

    public SearchEngine getSearchEngine() {
        return searchEngine;
    }

    public List<String> getIcons() {
        return icons;
    }
}
