package com.company.BuilderPattern;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class SearchEngine {
    public String getName() {
        return name;
    }

    private String name;

    public SearchEngine(String name) {
        this.name = name;
    }

    public void StartEngine() {
        System.out.println("The search engine is running and ready for search");
    }

}
