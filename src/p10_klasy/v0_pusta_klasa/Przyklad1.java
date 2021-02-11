package p10_klasy.v0_pusta_klasa;

public class Przyklad1 {
    public static void main(String[] args) {
        // nie mając klasy Pies, nie mogę zadeklarować zmiennej typu Pies
        // Pies pies = new Pies();

        // Mając klasę Osoba, mogę zadeklarować zmienną typu Osoba:
        Osoba a;

        // BTW: w tym momencie jeszcze nie ma obiektu
        //NK System.out.println(a); // niezainicjowana zmienna

        // Mogę stworzyć obiekt ("instancję") klasy Osoba:
        a = new Osoba();

        // Najczęściej zapisuje się to jednolinijkowo:
        Osoba b = new Osoba();

        System.out.println(a);
        System.out.println(b);

        // Na zmienną typu obiektowego można też wpisać wartość null - "brak obiektu".
        Osoba c = null;
        System.out.println(c);

        // Każda klasa jest podklasą klasy Object, więc każdy obiekt można wpisać na zmienną typu Object.
        Object x = a;
        System.out.println("x: " + x);
        System.out.println(x.getClass());
        System.out.println();

        // Każdy obiekt w Javie (nawet pustej klasy) posiada pewien zestaw metod.
        System.out.println("Przegląd metod:");
        System.out.println(a.getClass() + ", " + b.getClass());

        // Metody toString, equals, hashCode są stworzone z myślą, że twórcy klas mogą je nadpisywać

        System.out.println(a.toString() + ", " + b.toString());

        // equals i hashCode służą do porównywania obiektów
        // domyslnie sprawdzają czy to ten sam obiekt (w sensie miejsca w pamięci)
        // ale twórcy klas mogą zmienić działanie tych metod w swoich klasach

        System.out.println(a.equals(a)); // true
        System.out.println(a.equals(b)); // false

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        // są jeszcze metody związane z wielwątkowością
        // ale tutaj one nie mają szansy zadziałać
//		a.wait();
//		a.notify();
//		a.notifyAll();

        // I jeszcze bardziej techniczne clone oraz finalize

        // W Javie obiekty się tworzy, ale się ich nie usuwa.
        // To JVM, a dokładnie garbage collector, jest odpowiedzialny za usuwanie niepotrzebnych obiektów i odzyskiwanie pamięci.
    }
}
