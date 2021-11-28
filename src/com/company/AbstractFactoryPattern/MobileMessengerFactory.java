package com.company.AbstractFactoryPattern;

public class MobileMessengerFactory implements MessengerFactory{

    @Override
    public TextMessage createTextMessenger() {
        return new MobileTextMessage();
    }

    @Override
    public EmailMessage createEmailMessenger() {
        return new MobileEmailMessage();
    }

    @Override
    public VoiceMessage createVoiceMessenger() {
        return new MobileVoiceMessage();
    }

}
