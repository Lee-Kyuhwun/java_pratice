package access;

public class Speaker {

    private int volume;

    Speaker(int volume){
        this.volume = volume;
    }

    void volumeUp(){
        if(volume >= 100){
            System.out.println("볼륨을 더 높일 수 없습니다.");
        }
        else{
            volume +=10;

            System.out.println("현재 볼륨 : " + volume);
        }
    }

    void volumeDown(){
        if(volume <= 0){
            System.out.println("볼륨을 더 낮출 수 없습니다.");
        }
        else{
            volume -=10;
            System.out.println("현재 볼륨 : " + volume);
        }
    }

    void showVolume(){
        System.out.println("현재 볼륨 : " + volume);
    }
}
