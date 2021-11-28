package com.company.AbstractFactoryPattern;

public class MobileTextMessage implements TextMessage{

    private String text;

    @Override
    public boolean sendMessageOverText(String text) {
        this.text = text;
        System.out.println("Call to the mobile text API");
        System.out.println("Configuration mobile settings...");
        System.out.println("Message: " + text);
        System.out.println("Message sent.....");
        return true;
    }
}
