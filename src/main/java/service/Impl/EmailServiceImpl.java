package service.Impl;

import service.MessageService;

public class EmailServiceImpl implements MessageService {

    public void sendMessage(String message, String receiver) {
        // Logic to send an email.
        System.out.println("Email sent to " + receiver +" with message: " + message);
    }
}
