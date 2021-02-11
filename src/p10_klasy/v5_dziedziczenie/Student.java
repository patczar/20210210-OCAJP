package p10_klasy.v5_dziedziczenie;

import java.util.ArrayList;
import java.util.List;

public class Student extends Osoba {
    int rok;
    String kierunek;
    List<Double> oceny = new ArrayList<>();

    public Student() {
        super();
    }

    public Student(String imie, String nazwisko, int wiek, int rok, String kierunek) {
        super(imie, nazwisko, wiek);
        this.rok = rok;
        this.kierunek = kierunek;
    }

    void dodajOcene(double ocena) {
        oceny.add(ocena);
    }

    double sredniaOcen() {
        double suma = 0;
        for (Double ocena : oceny) {
            suma += ocena;
        }
        return suma / oceny.size();
    }

}
