package p10_klasy.v2_metody;

public class Osoba {
    String imie, nazwisko;
    int wiek;

    // Metoda to czynność, którą "potrafi wykonać obiekt" danej klasy.
    // Metody instancyjne (czyli nie statyczne) wywołuje się na obiektach.
    // Wewnątrz metod instancyjnych jest dostęp do zmiennych instancyjnych oraz zmiennych statycznych.
    // Osoba odwołuje się do "własnego imienia" itd.
    // Przed nazwami atrybutów można pisać this. , ale nie trzeba jeśli odwołanie jest jednoznaczne (czyli zmienna nie jest przesłonięta)

    void przedstawSie() {
        System.out.println("Nazywam się " + this.imie + " " + nazwisko + " i mam " + wiek + " lat.");
    }

    // Metody mogą zwracać wynik:
    boolean jestPelnoletnia() {
        return wiek >= 18;
    }

    // Metody mogą zmieniać stan
    void postarzejSie() {
        wiek++;
    }

}
