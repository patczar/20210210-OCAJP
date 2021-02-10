package p03_instrukcje;

import javax.swing.JOptionPane;

public class SwitchNull_Pusty {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Wpisz napis");
		System.out.println("Jestem przed switchem, napis = " + s);
		switch(s) {
		}
		
		System.out.println("Jestem za switchem");
		// morał: przekazanie wartości null do switcha (na napisach lub na enumach)
		// skutkuje wyjątkiem NPE
		
	}

}
