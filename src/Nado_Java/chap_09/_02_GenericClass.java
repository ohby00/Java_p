package Nado_Java.chap_09;

import Nado_Java.chap_09.Coffee.*;
import Nado_Java.chap_09.User.User;
import Nado_Java.chap_09.User.VIPUser;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByName c2 = new CoffeeByName("유재석");
        c2.ready();

        System.out.println("---------------------------------");

        CoffeeByN c3 = new CoffeeByN(34);
        c3.ready();

        CoffeeByN c4 = new CoffeeByN("박명수");
        c4.ready();

        System.out.println("---------------------------------");
        int c3Name = (int)c3.name;
        System.out.println("주문 고객 번호 : " + c3Name);

        String c4Name = (String)c4.name;
        System.out.println("주문 고객 번호 : " + c4Name);

        System.out.println("---------------------------------");

        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();

        Coffee<String> c6 = new Coffee<>("조세호");
        c6.ready();
        String c6Name = c6.name;
        System.out.println("주문 고객 이름 :" + c6Name);

        System.out.println("---------------------------------");

        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("강호동"));
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("서장훈"));
        c8.ready();
    }
}
