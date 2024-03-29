package com.company.AbstractFactoryPattern;

import java.util.List;

public class WebEmailMessage implements EmailMessage{
    private String text;
    @Override
    public boolean sendMessageOverEmail(String text) {
        this.text = text;
        System.out.println("Call to the web Email API....");
        System.out.println("configuring...");
        System.out.println("Message: " + text);
        System.out.println("Message has been sent");

        return true;
    }
}
