import consumer.Consumer;
import consumer.Impl.DIConsumerImpl;
import injector.MessageInjector;
import org.junit.Before;
import service.MessageService;

public class DIImplementationTest {

    private MessageInjector injector;

    @Before
    public void setup() {
        // Mock injector with anonymous class
        injector = new MessageInjector() {
            public Consumer getConsumer() {
                return new DIConsumerImpl(new MessageService() {
                    public void sendMessage(String message, String receiver) {
                        System.out.println("Mock Message Service implementation");
                    }
                });
            }
        };
    }
}
