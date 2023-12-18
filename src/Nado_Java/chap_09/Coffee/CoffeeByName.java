package Nado_Java.chap_09.Coffee;

public class CoffeeByName {
    public String Name;

    public CoffeeByName(String name) {
        Name = name;
    }

    public void ready(){
        System.out.println("커피 준비 완료 : " + Name);
    }
}
