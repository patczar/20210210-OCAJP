package p01_interakcja.okna;

import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JOptionPane;

public class Zakupy3_BigDecimal {

	public static void main(String[] args) {
		String towar = JOptionPane.showInputDialog("Co chcesz kupić?");
		BigDecimal cena = new BigDecimal(JOptionPane.showInputDialog("Ile kosztuje jedna sztuka?"));		
		BigDecimal ilosc = new BigDecimal(JOptionPane.showInputDialog("Ile sztuk chcesz kupić?"));		
		
		BigDecimal doZaplaty = cena.multiply(ilosc).setScale(2, RoundingMode.HALF_UP);
		JOptionPane.showMessageDialog(null,
			"Za " + ilosc + " sztuk towaru " + towar + " zapłacisz " + doZaplaty + " zł");
	}

}
