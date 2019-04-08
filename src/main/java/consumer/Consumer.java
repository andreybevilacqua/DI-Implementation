package consumer;

public interface Consumer {

    void processMessage(String message, String receiver);
}
