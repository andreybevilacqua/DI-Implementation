package injector.Impl;

import consumer.Consumer;
import consumer.Impl.DIConsumerImpl;
import injector.MessageInjector;
import service.Impl.EmailServiceImpl;

public class EmailInjector implements MessageInjector {

    public Consumer getConsumer() {
        return new DIConsumerImpl(new EmailServiceImpl());
    }
}
