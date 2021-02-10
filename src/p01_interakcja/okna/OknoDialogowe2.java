package p01_interakcja.okna;

import javax.swing.JOptionPane;

public class OknoDialogowe2 {

	public static void main(String[] args) {
		String imie = JOptionPane.showInputDialog("Jak masz na imię?");		
		String wiekTekstowo = JOptionPane.showInputDialog("Ile masz lat, " + imie + "?");

		int wiek = Integer.parseInt(wiekTekstowo);
		
		if(wiek >= 18) {
			JOptionPane.showMessageDialog(null, "Witaj " + imie
					+ ", możesz kupić piwo :)");
		} else {
			JOptionPane.showMessageDialog(null, "Witaj " + imie
					+ ", dla niepełnoletnich tylko cukierki...");
		}
	}

}
