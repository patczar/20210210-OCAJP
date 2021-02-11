package p11_referencje;

public class Referencje1 {
    public static void main(String[] args) {
        Osoba ala = new Osoba("Ala", "Kowalska", 30);
        Osoba ola = new Osoba("Ola", "Malinowska", 20);

        Konto a = new Konto(1, 1000, ala);
        Konto b = new Konto(2, 2000, ola);
        Konto c = b;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println();
        
        b.wplata(40);
        c.wplata( 8);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println();
        
        b = a;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println();

        c = b;
        // tracimy dowiązanie do konta nr 2
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println();
        
        a = null;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println();
        
        c = b = a;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println();
        
    }
}
