package Nado_Java.P;

import Nado_Java.P.Unit.Marin;
import Nado_Java.P.Unit.Unit;
import Nado_Java.P.Unit.Unitalb;
import Nado_Java.P.Unit.firebet;

public class Palyer {
    public static void main(String[] args) {
        Unitalb fire = new firebet();
        Unitalb marin = new Marin();


        Unit unit = new Unit();
        unit.setUnitalb(marin);


        unit.Hp();
        unit.Mp();

    }
}
