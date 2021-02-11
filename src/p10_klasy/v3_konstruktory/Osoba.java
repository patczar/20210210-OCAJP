package p10_klasy.v3_konstruktory;

public class Osoba {
    String imie, nazwisko;
    int wiek;

    Osoba() {

    }

    Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }
    // w klasie może być wiele konstruktorów, które różnią się ilością lub typem parametrów

    void przedstawSie() {
        System.out.println("Nazywam się " + imie + " " + this.nazwisko + " i mam " + wiek + " lat.");
    }

    boolean jestPelnoletnia() {
        return wiek >= 18;
    }

    void postarzejSie() {
        wiek++;
    }

}
