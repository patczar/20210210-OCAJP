package p11_referencje;

public class PrzykladKonto {
    public static void main(String[] args) {
        Osoba ala = new Osoba("Ala", "Kowalska", 30);
        Konto a = new Konto(1, 1000, ala);

        System.out.println(a);
        a.wplata(300);
        System.out.println(a);


    }
}
