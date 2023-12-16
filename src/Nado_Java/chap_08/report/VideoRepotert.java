package Nado_Java.chap_08.report;

public class VideoRepotert implements Reportable{
    @Override
    public void report() {
        System.out.println("VidoeRe 직전 30초 영상과 함께 진행합니다.");
    }
}
