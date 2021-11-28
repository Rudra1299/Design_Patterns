package com.company.AbstractFactoryPattern;

public class Application {
    public static void main(String[] args) {
        FactoryCreator.ServiceType serviceType = FactoryCreator.ServiceType.WEB;
        String text = "This is the message to be sent";

        MessengerFactory messengerFactory = FactoryCreator.makeFactory(serviceType);

        EmailMessage emailMessage= messengerFactory.createEmailMessenger();
        emailMessage.sendMessageOverEmail(text);

        VoiceMessage voiceMessage = messengerFactory.createVoiceMessenger();
        voiceMessage.sendMessageOverVoice(text);

    }
}
