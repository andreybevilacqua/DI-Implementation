package injector.Impl;

import consumer.Consumer;
import consumer.Impl.DIConsumerWithSetter;
import injector.MessageInjector;
import service.Impl.EmailServiceImpl;

public class EmailInjectorWithSetter implements MessageInjector {

    @Override
    public Consumer getConsumer() {
        DIConsumerWithSetter consumer = new DIConsumerWithSetter();
        consumer.setService(new EmailServiceImpl());
        return consumer;
    }
}
