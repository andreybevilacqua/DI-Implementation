package injector.Impl;

import consumer.Consumer;
import consumer.Impl.DIConsumerImpl;
import injector.MessageInjector;
import service.Impl.SMSServiceImpl;

public class SMSInjector implements MessageInjector {

    public Consumer getConsumer() {
        return new DIConsumerImpl(new SMSServiceImpl());
    }

}
