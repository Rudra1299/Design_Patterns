package com.company.BuilderPattern;

import java.util.List;

public class SamsungUI {
    private Date date;
    private  SearchEngine searchEngine;
    private List<String> icons;
    private Assistant assistant;

    public SamsungUI(Date date, SearchEngine searchEngine, List<String> icons, Assistant assistant) {
        this.date = date;
        this.searchEngine = searchEngine;
        this.icons = icons;
        this.assistant = assistant;
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

    public Assistant getAssistant() {
        return assistant;
    }
}
