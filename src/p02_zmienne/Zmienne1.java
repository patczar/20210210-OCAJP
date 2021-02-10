package p02_zmienne;

public class Zmienne1 {

    public static void main(String[] args) {

        // Aby użyć zmiennej, trzeba ją zadeklarować.
        //NK System.out.println(x);
        //NK x = 15;
        //NK System.out.println(x);

        // Deklaracja zmiennej:
        String txt;
        int x;

        // Zmienne lokalne (czyli deklarowane wewnątrz metod)
        // nie są automatycznie inicjowane na żadną wartość.
        // Niezainicjowanych zmiennych lokalnych nie wolno odczytywać (błąd kompilacji).

        //NK System.out.println(txt);
        //NK System.out.println(x);
        //NK x = 2 * x;

        txt = "Ala";
        x = 25;
        System.out.println(x); // OK
        System.out.println(txt); // OK
        x *= 2; // OK

        // ponowne przypisanie = zmiana wartości zmiennej
        txt = "Ola";
        x = x+1;
        System.out.println(x);

        // Zazwyczaj wartość zmiennej podaje się od razu w miejscu deklaracji:
        int y = 100, z = 200;
        String miasto = "Warszawa";

        System.out.println(y + z);
        System.out.println(miasto);

    }

}
