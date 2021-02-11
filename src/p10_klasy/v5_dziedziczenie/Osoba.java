package p10_klasy.v5_dziedziczenie;

import java.util.Objects;

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

    @Override
    public String toString() {
        return imie + " " + nazwisko + " (" + wiek + " lat)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return wiek == osoba.wiek &&
                Objects.equals(imie, osoba.imie) &&
                Objects.equals(nazwisko, osoba.nazwisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, wiek);
    }
}
