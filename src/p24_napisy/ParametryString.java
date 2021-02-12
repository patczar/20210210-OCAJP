package p24_napisy;

public class ParametryString {

    static void test(String s) {
        System.out.println("s: " + s); // Ala
        s += " ma kota";   //  s = (s + " ma kota")   -- tu jest tworzony nowy obiekt
        s.concat(" i psa"); // jest tworzony nowy obiekt, ale s pozostaje bez zmian
        System.out.println("s: " + s); // Ala ma kota
    }

    public static void main(String[] args) {
        String a = "Ala";
        String b = a;

        System.out.println("a: " + a); // Ala
        test(a);
        System.out.println("a: " + a); // Ala
        System.out.println("b: " + b); // Ala
        System.out.println();

        System.out.println(a == b); // T
        System.out.println(a.equals(b)); // T
        System.out.println();
        b += " ma chomika";
        System.out.println("a: " + a); // Ala
        System.out.println("b: " + b); // Ala ma chomika
        System.out.println(a == b); // F
        System.out.println(a.equals(b)); // F
    }
}
