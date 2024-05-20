package oop1;

public class MusicPlayerMain2 {

    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        data.isOn = true;
        System.out.println("플레이어의 전원상태 : " + data.isOn);
        on(data);

        //볼륨증가;
        on(data);

        // 볼륨 감소
        minusVolume(data);

        // 음악 플레이어 상태
        System.out.println("플레이어의 전원상태 : " +   data.isOn);
        if(  data.isOn){
            System.out.println("isOn = " +  data.isOn);
        }else{
            System.out.println("isOn OFF = " +   data.isOn);
        }

        // 음악 플레이어 끄기
        data.isOn = false;
        System.out.println("플레이어의 전원상태 : " +   data.isOn);

    }

    private static void minusVolume(MusicPlayerData data) {
        data.volume =   data.volume - 1;
        System.out.println("현재 볼륨 : " +   data.volume);
    }

    private static void on(MusicPlayerData data) {
        // 볼륨 증가
        data.volume +=1;
        System.out.println("현재 볼륨 : " +   data.volume);
    }
}
