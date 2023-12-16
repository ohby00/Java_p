package Nado_Java.chap_08;

public class _01_AbstractClass {
    public static void main(String[] args) {

//        Camera ca = new Camera();

        FactoryCam Ft = new FactoryCam();
        Ft.showMainFe();

        SpeedCam sc = new SpeedCam();
        sc.showMainFe();

    }
}
