package consumer.Impl;

import consumer.Consumer;
import service.MessageService;

public class DIConsumerWithSetter implements Consumer {

    private MessageService service;

    public void setService(MessageService service) { this.service = service; }

    @Override
    public void processMessage(String message, String receiver) {
        service.sendMessage(message, receiver);
    }
}
