package oop1;

public class MusicPlayerMain1 {

    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        // 플레이어 켜기
        isOn = true;
        System.out.println("음악 플레이어 를 시작 합니다");

        //볼륨 증가
        volume++;
        System.out.println("volume = " + volume);
        //볼륨 증가
        volume++;
        System.out.println("volume = " + volume);
        //볼륨 감소
        volume--;
        System.out.println("volume = " + volume);

        //음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨 = " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
        //음아 플레이어 끄기
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}
