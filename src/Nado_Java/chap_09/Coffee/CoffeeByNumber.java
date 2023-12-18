package Nado_Java.chap_09.Coffee;

public class CoffeeByNumber {
    public int waitingNum;


    public CoffeeByNumber(int waitingNum) {
        this.waitingNum = waitingNum;
    }

    public void ready(){
        System.out.println("커피 준비 완료 : " + waitingNum);
    }
}
