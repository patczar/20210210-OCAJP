package p10_klasy.v3_konstruktory;

import java.util.ArrayList;
import java.util.List;

public class Wypisywanie {
    public static void main(String[] args) {
        Osoba ala = new Osoba("Ala", "Kowalska", 30);
        System.out.println(ala);

        String s;
        // każdy obiekt w Javie posiada metodę toString
        s = ala.toString();
        System.out.println(s);

        // to właśnie ta metoda daje tekstową reprezentację obiektu
        // i gdy obiekt printujemy lub w inny sposób zamieniamy na tekst, to właśnie ta
        // metoda jest używana

        s = "obiektem jest: " + ala;
        System.out.println(s);

        s = String.valueOf(ala);
        System.out.println(s);
        System.out.println();

        List<Osoba> osoby = new ArrayList<>();
        osoby.add(ala);
        osoby.add(new Osoba("Ola", "Malinowska", 40));
        osoby.add(new Osoba("Jan", "Kowalski", 33));

        System.out.println(osoby);
        // Java używam metody toString także gdy obiekty są elementami kolekcji, a
        // wypisujemy kolekcję
    }
}
