package p01_interakcja.okna;

import javax.swing.JOptionPane;

/* Jednym ze sposobów komunikacji z użytkownikiem są okna dialogowe.
   W Javie są one łatwe w użyciu (łatwiejsze niż pełnowartościowe aplikacje okienkowe),
   korzysta się poprzez klasę JOptionPane.
   Najważniejsze są trzy rodzaje okien dialogowych:
   * showMessageDialog - tylko komunikat
   * showInputDialog - pytanie i mozliwośc podania tekstowej odpowiedzi
   * showConfirmDialog - pytanie i odpowiedź Yes/No/Cancel
*/

public class OknoDialogowe1 {

	public static void main(String[] args) {
		String imie = JOptionPane.showInputDialog("Jak masz na imię?");
		JOptionPane.showMessageDialog(null, "Witaj " + imie);

	}

}
