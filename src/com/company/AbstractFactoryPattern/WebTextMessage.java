package com.company.AbstractFactoryPattern;

public class WebTextMessage implements TextMessage{
    private String text;

    @Override
    public boolean sendMessageOverText(String text) {
        this.text = text;
        System.out.println("Call to the web text API");
        System.out.println("Configuration settings...");
        System.out.println("Message: " + text);
        System.out.println("Message sent.....");
        return true;
    }
}
