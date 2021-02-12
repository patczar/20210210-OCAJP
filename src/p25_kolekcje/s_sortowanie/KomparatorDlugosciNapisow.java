package p25_kolekcje.s_sortowanie;

import java.util.Comparator;

public class KomparatorDlugosciNapisow implements Comparator<String> {
	public int compare(String s1, String s2) {
		/* Jeśli zwracam <0 to znaczy że s1 uważam za mniejsze.
		 * Jeśli zwracam >0 to znaczy że s1 uważam za większe.
		 * Jeśli zwracam 0 to znaczy, że są równe.
		 */
		return s1.length() - s2.length();
	}
}
