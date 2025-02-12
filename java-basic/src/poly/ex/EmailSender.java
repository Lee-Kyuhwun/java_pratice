package poly.ex;

public class EmailSender implements Sender {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}
