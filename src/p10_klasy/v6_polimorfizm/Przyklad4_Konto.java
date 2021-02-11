package p10_klasy.v6_polimorfizm;

public class Przyklad4_Konto {

	public static void main(String[] args) {
		Osoba ala = new Osoba("Ala", "Kowalska", 30);
		Konto konto = new Konto(101, 5000, ala);
		
		System.out.println(konto);

		konto.wplata(300);
		System.out.println(konto); // 5300
		
		konto.wyplata(100);
		System.out.println(konto); // 5200

		
	}

}
