package access;

public class SpeakerMain {
    public static void main(String[] args) {

        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();
        speaker.volumeUp();

        speaker.volumeDown();
        speaker.showVolume();

        //필드에 직접
    }
}
