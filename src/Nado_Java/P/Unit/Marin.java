package Nado_Java.P.Unit;

public class Marin implements Unitalb {

    int hp = 100;
    int mp = 50;

    @Override
    public void Hp() {
        System.out.println("마린의 체력은" + hp + "입니다.");
    }

    @Override
    public void Mp() {
        System.out.println("마린의 마나는" + mp + "입니다.");
    }
}
