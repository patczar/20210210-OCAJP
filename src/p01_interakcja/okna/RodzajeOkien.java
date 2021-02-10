package p01_interakcja.okna;

import java.time.LocalDateTime;

import javax.swing.JOptionPane;

public class RodzajeOkien {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "To jest zwykły MessageDialog");
		JOptionPane.showMessageDialog(null, "To jest MessageDialog typu WARNING", "Uwaga", JOptionPane.WARNING_MESSAGE);
		// są też inne typy: PLAIN_MESSAGE, INFORMATION_MESSAGE, QUESTION_MESSAGE, WARNING_MESSAGE, ERROR_MESSAGE

		String cos = JOptionPane.showInputDialog("To jest inputDialog.\nNapisz coś:");
		String data = JOptionPane.showInputDialog("To jest inputDialog z początkową wartością.", LocalDateTime.now());
		
		int wybor = JOptionPane.showConfirmDialog(null, "Czy chcesz " + cos + " o godzinie " + data +"?");
		switch(wybor) {
		case JOptionPane.YES_OPTION: JOptionPane.showInternalMessageDialog(null, "TAK internal"); break;
		case JOptionPane.NO_OPTION: JOptionPane.showInternalMessageDialog(null, "NO internal"); break;
		case JOptionPane.CANCEL_OPTION: JOptionPane.showInternalMessageDialog(null, "Cancel internal"); break;
		}
		
	}

}
