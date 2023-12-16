package Nado_Java.chap_06;

public class _03_Return {

    public static String getPhoneNum(){
        String phoneN = "010-7703-3211";
        return phoneN;
    }

    public static String getAddress(){
        return "오창";
    }


    public static void main(String[] args) {
        String  address = getAddress();
        System.out.println(address);
        System.out.println(getPhoneNum());
    }
}
