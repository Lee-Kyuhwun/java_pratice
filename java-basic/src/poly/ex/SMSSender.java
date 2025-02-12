package poly.ex;

public class SMSSender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS: " + message);
    }
}
