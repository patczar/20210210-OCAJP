package p10_klasy.v3_konstruktory;

import java.util.Objects;

public class Porownywanie {
    public static void main(String[] args) {
        Osoba a = new Osoba("Ala", "Kowalska", 30);
        Osoba b = new Osoba("Ala", "Kowalska", 30);
        Osoba c = new Osoba("Ola", "Kowalska", 27);
        Osoba r = a;

        // == ZAWSZE porównuje adresy, sprawdza czy to "ten sam obiekt"
        System.out.println("Porównywanie za pomocą ==");
        System.out.println(a == a); // T
        System.out.println(a == r); // T  obie zmienne wskazują na ten sam obiekt
        System.out.println(a == b); // F  chociaż dwa obiekty zawierają te same dane, to są osobnymi obiektami w pamięci (mają różne adresy)
        System.out.println(a == c); // F
        System.out.println();

        // equals DOMYŚLNIE działa tak samo jak ==
        // a autor klasy może zmienić to zachowanie
        System.out.println("Porównywanie za pomocą equals");
        System.out.println(a.equals(a)); // T
        System.out.println(a.equals(r)); // T
        System.out.println(a.equals(b)); // F
        System.out.println(a.equals(c)); // F
        System.out.println();

        System.out.println("Objects.equals");
        System.out.println(Objects.equals(a, a)); // T
        System.out.println(Objects.equals(a, r)); // T
        System.out.println(Objects.equals(a, b)); // F
        System.out.println(Objects.equals(a, c)); // F
        System.out.println(Objects.equals(null, c)); // F
        System.out.println();

        // hashCode domyślnie jest wyliczany na podstawie adresu. Dla osobnych obiektów wychodzą różne hashCody
        System.out.println("hash kody:");
        System.out.println("a: " + a.hashCode());
        System.out.println("b: " + b.hashCode());
        System.out.println("c: " + c.hashCode());
        System.out.println("r: " + r.hashCode());

    }
}