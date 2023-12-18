package Nado_Java.chap_09.Coffee;

public class CoffeeByN {
    public Object name;

    public CoffeeByN(Object name) {
        this.name = name;
    }

    public void ready(){
        System.out.println("커피 준비 완료 " + name);
    }
}
