package consumer.Impl;

import consumer.Consumer;
import service.MessageService;

public class DIConsumerImpl implements Consumer {

    private MessageService service;

    public DIConsumerImpl(MessageService service) { this.service = service; }

    public void processMessage(String message, String receiver) {
        // Do some message validation, business logic, etc
        this.service.sendMessage(message, receiver);
    }

}
