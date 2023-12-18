package Nado_Java.chap_09;

public class _01_Generics {
    public static void main(String[] args) {
        // 제네릭스
        Integer[] iArray = {1, 2, 3, 4, 5};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A", "B", "C", "D", "E"};

        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);

        System.out.println("---------------------------------------------");

        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);
    }

    private static <T> void printAnyArray(T[] array){
        for (T t : array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    private static void printIntArray(Integer[] I_Array) {
        for (int i : I_Array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void printDoubleArray(Double[] D_Array) {
        for (Double d : D_Array) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    private static void printStringArray(String[] S_Array) {
        for (String s : S_Array) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
