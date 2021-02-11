package p10_klasy.v9_typowe_klasy;

import java.time.LocalDate;

public class Przyklad {
    public static void main(String[] args) {
        Osoba ala = new Osoba("Ala", "Kowalska", LocalDate.of(1994,5,6));
        System.out.println(ala);

        // Pola są prywatne i nie ma do nich bezpośredniego dostępu:
        //NK System.out.println(ala.imie);

        System.out.println(ala.getImie());



    }
}
