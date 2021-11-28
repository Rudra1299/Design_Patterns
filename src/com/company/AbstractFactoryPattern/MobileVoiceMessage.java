package com.company.AbstractFactoryPattern;

public class MobileVoiceMessage implements VoiceMessage{

    private String text;

    @Override
    public boolean sendMessageOverVoice(String text) {
        this.text = text;
        System.out.println("Call to mobile voice message API");
        System.out.println("Configuration mobile settings...");
        System.out.println("Voice message sent");

        return true;
    }
}
