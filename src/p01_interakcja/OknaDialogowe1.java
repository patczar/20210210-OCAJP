package p01_interakcja;

import javax.swing.JOptionPane;

public class OknaDialogowe1 {

	public static void main(String[] args) {
		String imie = JOptionPane.showInputDialog("Jak masz na imię?");
		
		String wiekStr = JOptionPane.showInputDialog("Ile masz lat, " + imie + "?");
		int wiek = Integer.parseInt(wiekStr);
		
		if(wiek >= 18) {
			JOptionPane.showMessageDialog(null, "Możesz kupić piwo");
		} else {
			JOptionPane.showMessageDialog(null, "Jesteś niepełnoletni(a)");
		}

	}

}
