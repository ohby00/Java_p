package Nado_Java.P.Unit;

public class firebet implements Unitalb{

    int hp = 50;
    int mp = 70;

    @Override
    public void Hp() {
        System.out.println("파벳의 체력은" + hp + "입니다.");
    }

    @Override
    public void Mp() {
        System.out.println("파벳의 마나는" + mp + "입니다.");
    }
}
