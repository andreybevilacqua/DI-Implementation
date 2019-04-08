package service.Impl;

import service.MessageService;

public class SMSServiceImpl implements MessageService {

    public void sendMessage(String message, String receiver) {
        // Logic to send a SMS.
        System.out.println("SMS sent to " + receiver +" with message: " + message);
    }
}
