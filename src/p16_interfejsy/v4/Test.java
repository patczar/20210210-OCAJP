package p16_interfejsy.v4;

import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Test implements AAA, BBB {

	public static void main(String[] args) {
		// to jest metoda z interfejsu AAA - metoda domyślna
		Test t = new Test();
		System.out.println(t.x());

		// metody statyczne z interfejsów nie są dziedziczone przez klasy
		// Test.x();
		System.out.println(BBB.x()); // metodę statyczną trzeba wywołać poprzez nazwę interfejsu
		
		// natomiast zmienne (czyli stałe) są
		System.out.println(stala);
		System.out.println(stala);
		
		JButton guzik = new JButton("OK");
		guzik.setHorizontalAlignment(JButton.CENTER);
		// stała CENTER jest dziedziczona przez JButton z interfejsu SwingConstants
		guzik.setHorizontalAlignment(SwingConstants.CENTER);
	}
}
