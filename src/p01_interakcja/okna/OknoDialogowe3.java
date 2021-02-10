package p01_interakcja.okna;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

public class OknoDialogowe3 {

	public static void main(String[] args) {
		
		try {
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
		
		} catch(HeadlessException e) {
			System.out.println("Brak interfejsu graficznego - nie pogadamy...");
		} catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null,
					"Nieprawidłowy format liczby", "Błąd", JOptionPane.ERROR_MESSAGE);
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null,
					"Inny błąd " + e, "Błąd", JOptionPane.ERROR_MESSAGE);
		}
	}

}
