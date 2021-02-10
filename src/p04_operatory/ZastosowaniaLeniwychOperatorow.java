package p04_operatory;

import javax.swing.JOptionPane;

public class ZastosowaniaLeniwychOperatorow {

	public static void main(String[] args) {
		
		String jezyk = JOptionPane.showInputDialog("Jaki jest Twój ulubiony język programowania?");
		
		if(jezyk != null && jezyk.equals("Java")) {
			JOptionPane.showMessageDialog(null, "Brawo");
		} else {
			JOptionPane.showMessageDialog(null, "Źle");
		}
		
		// jeśli chodzi o tę konkretną sytuację, to pisząc w tej kolejności zapobiegamy wyjątkowi NPE
		if("Java".equals(jezyk)) {
			JOptionPane.showMessageDialog(null, "Brawo");
		} else {
			JOptionPane.showMessageDialog(null, "Źle");
		}
	}

}
