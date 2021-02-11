package p10_klasy.v1_atrybuty;

public class Przyklad2 {
    public static void main(String[] args) {
        Osoba a = new Osoba();
        // W obiekcie istnieją jego pola / atrybuty / zmienne
        // Jeśli nie są prywatne, mam do nich dostęp z zewnątrz:
        System.out.println(a.imie + " " + a.nazwisko + " " + a.wiek);
        // Podczas tworzenia obiektu, atrybutom są nadawane domyślne wartości: 0, false, null

        a.imie = "Ala";
        a.nazwisko = "Kowalska";
        a.wiek = 30;
        System.out.println(a.imie + " " + a.nazwisko + " " + a.wiek);

        // Każdy obiekt ma swoje atrybuty.
        Osoba b = new Osoba();
        b.imie = "Jan";
        b.nazwisko = "Kowalski";
        b.wiek = 22;
        System.out.println(b.imie + " " + b.nazwisko + " " + b.wiek);

        // Inaczej niż w Pythonie, w Javie nie można dodać atrybutu, który nie był zadeklarowany w klasie
        // a.kasa = 1500;

        // dostęp do składowych statycznych poprzez obiekt jest mylący dla czytelnika i dlatego IntelliJ wyświetla warning
        // Ale to się kompiluje i wszystkie pon iższe odwołania dotyczą tego samego miejsca w pamięci
        System.out.println(a.wspolnaZmienna + " " + b.wspolnaZmienna + " " + Osoba.wspolnaZmienna);
        Osoba.wspolnaZmienna++;
        a.wspolnaZmienna++;
        b.wspolnaZmienna++;
        System.out.println(a.wspolnaZmienna + " " + b.wspolnaZmienna + " " + Osoba.wspolnaZmienna);

    }
}
