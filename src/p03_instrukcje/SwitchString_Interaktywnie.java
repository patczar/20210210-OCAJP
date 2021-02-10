package p03_instrukcje;

import javax.swing.JOptionPane;

public class SwitchString_Interaktywnie {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Wpisz napis");
		System.out.println("Jestem przed switchem, napis = " + s);
		
		// Wielkość liter, spacje itp.: mają znaczenie.
		// Nie są przeprowadzane żadne "normalizacje".
		// Nie działają żadne "wildcardy" typu * % itp.
		
		// Jeśli do switch przekażemy wartość null dojdzie d wyjątku NullPointerException
		switch(s) {
			case "Ala": System.out.println("Ala ma kota"); break;
			case "Ola": System.out.println("Ola ma psa"); break;
			//NK case null: System.out.println("NULL");
			default: System.out.println("Nieznana osoba");
		}
	}

}
