import consumer.Consumer;
import injector.Impl.EmailInjector;
import injector.Impl.SMSInjector;
import injector.MessageInjector;

public class DIImplementation {

    public static void main(String[] args) {
        String msg = "Hey man";
        String email = "andrey@ab.com";
        String phone = "40666666";

        MessageInjector injector;
        Consumer consumer;

        // Send email
        injector = new EmailInjector();
        consumer = injector.getConsumer();
        consumer.processMessage(msg, email);

        // Send SMS
        injector = new SMSInjector();
        consumer = injector.getConsumer();
        consumer.processMessage(msg, phone);

    }
}
