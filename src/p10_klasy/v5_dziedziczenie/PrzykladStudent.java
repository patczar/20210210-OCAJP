package p10_klasy.v5_dziedziczenie;

public class PrzykladStudent {
    public static void main(String[] args) {
        Osoba osoba = new Osoba();
        osoba.imie = "Ala";
        osoba.nazwisko = "Kowalska";
        osoba.wiek = 30;

        System.out.println(osoba);
        osoba.przedstawSie();
        Sklep.sprzedajPiwo(osoba);
        System.out.println();


        Student student = new Student();
        // Gdy klasa Student jest podklasą klasy Osoba,
        // to obiekt klasy Student posiada wszystkie te zmienne i metody, które były zdefiniowane w klasie Osoba
        student.imie = "Adam";
        student.nazwisko = "Nowak";
        student.wiek = 20;
        student.przedstawSie();

        // Oprócz nich dostępne są także nowe zmienne i metody, dodane w podklasie
        student.rok = 2;
        student.kierunek = "geografia";
        student.dodajOcene(4.5);
        student.dodajOcene(3.5);
        System.out.println(student.sredniaOcen());

        // Możemy też użyć obiektu klasy Student wszędzie tam, gdzie Java oczekuje obiekty klasy Osoba
        // "zasada podstawiania", np. student może kupić piwo
        Sklep.sprzedajPiwo(student);

        // student może byc właścicielem konta
        Konto k = new Konto(1, 0, student);

        // Tego nie można zrobić z obiektem klasy "podobnej", która ma takie same pola, ale oficjalnie nie jest podklasą:
        // StudentJakoKopia_TylkoTlumaczenie oszust = new StudentJakoKopia_TylkoTlumaczenie();
        // Sklep.sprzedajPiwo(oszust);
        // Fundamentalna różnica między językami takimi jak Python, PHP, JS i typowaniem kaczym ("duck typing")
        // a językami takimi jak Java, C++, C# i typowaniem eksplicytnym (jawnym) i statycznym.

        // możemy po prostu obiekt Student wpisać na zmienną typu Osoba:
        Osoba ktos = student;
        System.out.println(ktos);

        // Z nadklasy nie są dziedziczone konstruktory
        Osoba osoba2 = new Osoba("Ola", "Malinowska", 40);
        //NK Student student2 = new Student("Jan", "Kowalski", 22);

        Student student3 = new Student("Jan", "Kowalski", 22, 3, "geologia");
        student3.przedstawSie();

    }
}
