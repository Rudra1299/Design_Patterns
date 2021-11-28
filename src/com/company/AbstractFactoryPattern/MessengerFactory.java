package com.company.AbstractFactoryPattern;

public interface MessengerFactory {

    TextMessage createTextMessenger();
    EmailMessage createEmailMessenger();
    VoiceMessage createVoiceMessenger();

}
