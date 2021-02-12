package p06_funkcje.teoria;

public class Funkcje3_Wynik {
	
	static int liczba() {
		return 44;
	}
	
	static int dodaj(int x, int y) {
		return x + y;
	}
	
	static int max(int x, int y) {
		if(x > y) {
			return x;
		} else {
			return y;
		}
	}

	public static void main(String[] args) {
		System.out.println("Początek main");
		System.out.println("Wywołam funkcję liczba()");
		liczba();
		System.out.println("Już wywołałem...");
		System.out.println();
		
		int wynik = liczba();
		System.out.println("wynik: " + wynik);
		System.out.println(liczba() * 2);
		System.out.println();
		
		wynik = dodaj(13, 12);
		System.out.println("Dodawanie zwróciło wynik " + wynik);
	}

}
