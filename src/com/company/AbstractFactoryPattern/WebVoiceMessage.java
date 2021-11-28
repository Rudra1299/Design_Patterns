package com.company.AbstractFactoryPattern;

public class WebVoiceMessage implements VoiceMessage{
    private String text;

    @Override
    public boolean sendMessageOverVoice(String text) {
        this.text = text;
        System.out.println("Call to web voice message API");
        System.out.println("Configuration settings...");
        System.out.println("Voice message sent");

        return true;
    }
}
