package p10_klasy.v9_typowe_klasy;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Osoba {
    private String imie;
    private String nazwisko;
    private LocalDate dataUrodzenia;

    public Osoba() {
        // default constructor (czyli bez parametrów)
        // wiele technologii wymaga, aby taki konstruktor istniał - wtedy dobrze działają
    }

    public Osoba(String imie, String nazwisko, LocalDate dataUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    // Poza standardowymi metodami get/set można zdefiniować też własne metody
    // Konwencje: metody, które służą do odczytowania informacji z obiektu, nawet jeśli to nie jest
    // odczyt jednej zmiennej (tylko jakaś konwersja itd) nazywa się get????
    public int getWiek() {
        if(dataUrodzenia == null) {
            return 0;
        }
        Period czasZycia = Period.between(dataUrodzenia, LocalDate.now());
        return czasZycia.getYears();
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", dataUrodzenia=" + dataUrodzenia +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return Objects.equals(imie, osoba.imie) &&
                Objects.equals(nazwisko, osoba.nazwisko) &&
                Objects.equals(dataUrodzenia, osoba.dataUrodzenia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, dataUrodzenia);
    }
}
