package company;

import java.util.Arrays;
import java.util.List;

public class Main {


    static void m(Integer i) {
        System.out.println("m(int)");
    }

    static <T> void m(T t) {
        System.out.println("m(T)");
    }

    static <T> void f(T t) {
        m(t);
    }

    public static void main(String[] args) {
        f("Hello");
        f(123);
        f(4000000000L);

    }

}
