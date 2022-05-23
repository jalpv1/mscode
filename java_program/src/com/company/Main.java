package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

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

      // System.out.println(findMax(1,4444,7)); ;
    }

//    static <T> T findMax(T t1, T t2, T t3) {
//        if (t1 instanceof Comparable && t2 instanceof Comparable && t3 instanceof Comparable) {
//            T currentMax = t1;
//            List<T> values = Arrays.asList(t1, t2, t3);
//            for (T value : values) {
//                if (((Comparable<T>) value).compareTo(currentMax) == 1) {
//                    currentMax = value;
//                }
//
//            }
//            return currentMax;
//        }
//        return null;
//    }
}
