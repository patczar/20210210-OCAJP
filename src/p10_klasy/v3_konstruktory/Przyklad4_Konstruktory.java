package p10_klasy.v3_konstruktory;

public class Przyklad4_Konstruktory {

    public static void main(String[] args) {
        // Tworzenie obiektu w taki sposób, że najpierw tworzymy niezainicjowany
        Osoba a = new Osoba();
        // a dopiero później wpisujemy dane
        a.imie = "Ala";

        // ma dwie wady:
        // 1) rozwlekłość zapisu

        // 2) zanim wpiszemy do obiektu wszystkie informacje, można (przypadkowo, niechcący...)
        //    użyć tego obiektu - a on jeszcze jest nieprzygotowany

        a.przedstawSie(); // Nazywam się Ala null i mam 0 lat.

        a.nazwisko = "Kowalska";
        a.wiek = 16;
        a.przedstawSie();
        System.out.println();

        Osoba b = new Osoba("Ola", "Malinowska", 30);
        b.przedstawSie();

    }
}
