package p06_funkcje.teoria;

import javax.swing.JOptionPane;

public class Funkcje2_Parametry {
	
	// Funkcja może mieć parametry:
	static void wyswietl(String napis) {
		JOptionPane.showMessageDialog(null, napis);
	}
	
	static void zaprosNaKurs(String jezyk, int iloscDni) {
		System.out.println("Zapraszamy na kurs języka " + jezyk + ", które będzie trwał " + iloscDni + " dni.");
	}
	
	public static void main(String[] args) {
		// Wywołując funkcję sparametryzowaną musimy przekazać wartości parametrów, czyli "argumenty".
		zaprosNaKurs("Java", 10);
		zaprosNaKurs("Python", 10);
		zaprosNaKurs("SQL", 4);
		System.out.println();

		wyswietl("Ala ma kota");
		
		String txt = "Ola ma psa";
		wyswietl(txt);
	}

}
