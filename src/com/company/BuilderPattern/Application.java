package com.company.BuilderPattern;

import java.net.ConnectException;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Date date = new Date(28, 11, 2021);
        SearchEngine searchEngine = new SearchEngine("Google");
        Assistant assistant = new Assistant("Google Assistant");
        List<String> samIcons = new ArrayList<>(List.of("Caller", "Messaging", "Camera", "Chrome"));

        List<String> onePIcons = new ArrayList<>(List.of("Caller", "Messaging", "Camera", "Gallery"));

        SamsungUIBuilder samsungUIBuilder = new SamsungUIBuilder();
        samsungUIBuilder.setDate(date);
        samsungUIBuilder.setSearchEngine(searchEngine);
        samsungUIBuilder.setIcons(samIcons);
        samsungUIBuilder.setAssistant(assistant);
        SamsungUI samsungUI = samsungUIBuilder.getProduct();

        OnePlusUIBuilder onePlusUIBuilder = new OnePlusUIBuilder();
        onePlusUIBuilder.setDate(date);
        onePlusUIBuilder.setIcons(onePIcons);
        OnePlusUI onePlusUI = onePlusUIBuilder.getProduct();
        System.out.println(onePlusUI.getSearchEngine());
    }
}
