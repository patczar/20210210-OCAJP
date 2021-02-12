package p22_wrappery;

import p12_klasy_tech.a03_statyczne.A;

import java.util.concurrent.atomic.AtomicInteger;

public class Wrappery10_Param {

    static void m(int x, Integer y, AtomicInteger z) {
        x += 1;
        y += 1;
        z.incrementAndGet();  // z++
    }

    public static void main(String[] args) {
        int a = 100;
        Integer b = 200;
        AtomicInteger c = new AtomicInteger(300);

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println();

        m(a, b, c);

        System.out.println("a: " + a); // 100
        System.out.println("b: " + b); // 200
        System.out.println("c: " + c); // 301
    }

}
