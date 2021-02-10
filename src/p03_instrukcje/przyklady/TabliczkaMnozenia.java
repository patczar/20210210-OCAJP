package p03_instrukcje.przyklady;

public class TabliczkaMnozenia {

	public static void main(String[] args) {
		for(int w = 1; w <= 10; w++) {
			for(int k = 1; k <= 10; k++) {
				System.out.print(w*k + " ");
			}
			System.out.println();
		}
	}
}
