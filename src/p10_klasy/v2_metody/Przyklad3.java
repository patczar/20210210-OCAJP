package p10_klasy.v2_metody;

public class Przyklad3 {
    public static void main(String[] args) {
        Osoba a = new Osoba();
        Osoba b = new Osoba();

        a.imie = "Ala";
        a.nazwisko = "Kowalska";
        a.wiek = 17;

        a.przedstawSie();
        b.przedstawSie();
        // Zauważmy w tym miejscu problem: dopóki nie ustawimy wartości atrybutów w obiekcie, są tam puste wartości null/0
        // To może skutkować błędami.

        if(a.jestPelnoletnia()) {
            System.out.println(a.imie + " jest pełnoletnia");
        } else {
            System.out.println(a.imie + " jest niepełnoletnia");
        }
        System.out.println();

        b.imie = "Ola";
        b.nazwisko = "Kowalska";
        b.wiek = 35;

        a.postarzejSie();

        a.przedstawSie();
        b.przedstawSie();
        if(a.jestPelnoletnia()) {
            System.out.println(a.imie + " jest pełnoletnia");
        } else {
            System.out.println(a.imie + " jest niepełnoletnia");
        }

    }
}
