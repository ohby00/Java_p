package Nado_Java.chap_08;

public class SpeedCam extends Camera{
    @Override
    public void showMainFe() {
        System.out.println("속도 측정, 번호 인식");
    }

    public void detect(){
        System.out.println("화재를 감지합니다.");
    }

    public void report(){
        System.out.println("화재 신고를 진행합니다.");
    }
}
