package Nado_Java.chap_08.detec;

public class FireDetector implements Detectable {
    @Override
    public void detect() {
        System.out.println("FireDe 일반 성능으로 화재를 감지합니다.");
    }
}
