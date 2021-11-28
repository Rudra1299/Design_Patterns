package com.company.AbstractFactoryPattern;

public class MobileEmailMessage implements EmailMessage{
    private String text;

    @Override
    public boolean sendMessageOverEmail(String text) {
        this.text = text;
        System.out.println("Call to the mobile Email API....");
        System.out.println("configuring mobile settings...");
        System.out.println("Message: " + text);
        System.out.println("Message has been sent");

        return true;
    }
}
