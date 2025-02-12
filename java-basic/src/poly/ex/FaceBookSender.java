package poly.ex;

public class FaceBookSender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message to Facebook: " + message);
    }
}
