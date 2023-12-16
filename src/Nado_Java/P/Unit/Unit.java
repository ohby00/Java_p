package Nado_Java.P.Unit;

public class Unit implements Unitalb{
    private Unitalb unitalb;

    public void setUnitalb(Unitalb unitalb) {
        this.unitalb = unitalb;
    }

    @Override
    public void Hp() {
        unitalb.Hp();
    }

    @Override
    public void Mp() {
        unitalb.Mp();
    }
}
