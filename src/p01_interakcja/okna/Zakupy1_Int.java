package p01_interakcja.okna;

import javax.swing.JOptionPane;

/*
Używając JOptionPane napisz taki program.
Niech program:
- pyta "Co chcesz kupić?"

- pyta "Ile kosztuje jedna sztuka?"

- pyta "Ile sztuk chcesz kupić?"

- oblicza co trzeba i wypiuje przykładowo:
"Za 3 sztuk towaru długopis zapłacisz 15 zł"
*/
public class Zakupy1_Int {

	public static void main(String[] args) {
		String towar = JOptionPane.showInputDialog("Co chcesz kupić?");
		int cena = Integer.parseInt(JOptionPane.showInputDialog("Ile kosztuje jedna sztuka?"));		
		int ilosc = Integer.parseInt(JOptionPane.showInputDialog("Ile sztuk chcesz kupić?"));		
		
		int doZaplaty = cena*ilosc;
		JOptionPane.showMessageDialog(null,
				"Za " + ilosc + " sztuk towaru " + towar + " zapłacisz " + doZaplaty + " zł");
		
		
	}

}
