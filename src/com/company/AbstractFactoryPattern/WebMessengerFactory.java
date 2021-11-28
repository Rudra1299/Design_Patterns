package com.company.AbstractFactoryPattern;

public class WebMessengerFactory implements MessengerFactory{

    @Override
    public TextMessage createTextMessenger() {
        return new WebTextMessage();
    }

    @Override
    public EmailMessage createEmailMessenger() {
        return new WebEmailMessage();
    }

    @Override
    public VoiceMessage createVoiceMessenger() {
        return new WebVoiceMessage();
    }

}
