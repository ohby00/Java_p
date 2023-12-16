package Nado_Java.chap_08;

import Nado_Java.chap_08.detec.AdvanceDec;
import Nado_Java.chap_08.detec.Detectable;
import Nado_Java.chap_08.detec.FireDetector;
import Nado_Java.chap_08.report.NomerReporter;
import Nado_Java.chap_08.report.Reportable;
import Nado_Java.chap_08.report.VideoRepotert;

public class _02_Interface {
    public static void main(String[] args) {
        Reportable nr = new NomerReporter();
        nr.report();

        Reportable rr = new VideoRepotert();
        rr.report();

        System.out.println("------------------");

        Detectable fireDetec = new FireDetector();
        fireDetec.detect();

        Detectable advanceFire = new AdvanceDec();
        advanceFire.detect();

        System.out.println("------------------");

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetect(advanceFire);
        factoryCam.setReport(rr);

        System.out.println("------------------");

        factoryCam.detect();
        factoryCam.report();
    }
}
