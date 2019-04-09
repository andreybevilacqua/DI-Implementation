import consumer.Consumer;
import consumer.Impl.DIConsumerImpl;
import injector.MessageInjector;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DIImplementationTest {

    private MessageInjector injector;

    @Before
    public void setup() {
        injector = () -> new DIConsumerImpl((message, receiver) -> System.out.println("Mock Message Service implementation"));
    }

    @Test
    public void test() {
        Consumer consumer = injector.getConsumer();
        consumer.processMessage("Hey man", "andrey@ab.com");
    }

    @After
    public void tear(){
        injector = null;
    }
}
