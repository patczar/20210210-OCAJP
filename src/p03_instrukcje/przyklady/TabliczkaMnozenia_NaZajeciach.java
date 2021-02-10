package p03_instrukcje.przyklady;

import javax.swing.JOptionPane;

public class TabliczkaMnozenia_NaZajeciach {

	public static void main(String[] args) {
		
		//int rozmiar = 10;
		int rozmiar = Integer.parseInt(JOptionPane.showInputDialog("Podaj rozmiar tabliczki"));
		
		for(int w = 1; w <= rozmiar; w++) {
			for(int k = 1; k <= rozmiar; k++) {
				//System.out.print(w*k + " ");
				//System.out.print(w*k + "\t");
				// System.out.printf("[liczba %d] ", w*k);
				System.out.printf("%3d ", w*k);
			}
			System.out.println();
		}
	}

}

