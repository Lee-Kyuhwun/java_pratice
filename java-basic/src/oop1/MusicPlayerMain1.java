package oop1;

public class MusicPlayerMain1 {

    public static void main(String[] args) {
        int volume =    0;

        boolean isOn = false;

        // 음악플레이어 키기

        isOn = true;
        System.out.println("플레이어의 전원상태 : " + isOn);

        // 볼륨 증가
        volume = volume + 1;
        System.out.println("현재 볼륨 : " + volume);

        //볼륨증가;
        volume = volume + 1;
        System.out.println("현재 볼륨 : " + volume);


        // 볼륨 감소
        volume = volume - 1;
        System.out.println("현재 볼륨 : " + volume);

        // 음악 플레이어 상태
        System.out.println("플레이어의 전원상태 : " + isOn);
        if(isOn){
            System.out.println("isOn = " + isOn);
        }else{
            System.out.println("isOn OFF = " + isOn);
        }

        // 음악 플레이어 끄기
        isOn = false;
        System.out.println("플레이어의 전원상태 : " + isOn);
    }
}
