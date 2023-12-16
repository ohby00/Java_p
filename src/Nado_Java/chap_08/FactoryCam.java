package Nado_Java.chap_08;

import Nado_Java.chap_08.detec.Detectable;
import Nado_Java.chap_08.report.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable {
    private Detectable detect;
    private Reportable report;

    public void setDetect(Detectable detect) {
        this.detect = detect;
    }

    public void setReport(Reportable report) {
        this.report = report;
    }

    @Override
    public void showMainFe() {
        System.out.println("화재 감지");
    }


    @Override
    public void detect() {
        detect.detect();
    }

    @Override
    public void report() {
        report.report();
    }
}
