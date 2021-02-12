package p06_funkcje.przyklady;

public class Powtorz {
	// TODO Napisz funkcję typu void, która wyświetla podany napis określoną liczbę razy
	
	static void powtorz(String napis, int ileRazy) {
		for(int i = 1; i <= ileRazy; i++) {
			System.out.println(napis);
		}
	}

	public static void main(String[] args) {
		powtorz("Ala ma kota", 5);
		powtorz("Ola ma psa", 3);
	}

}
