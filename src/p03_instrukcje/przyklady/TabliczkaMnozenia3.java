package p03_instrukcje.przyklady;

public class TabliczkaMnozenia3 {

	// Wersja alternatywna - dodawanie zamiast mnożenia
	public static void main(String[] args) {
		int N = 10;
		
		for(int w = 1; w <= N; w++) {
			for(int x = w; x <= w*N; x += w) {
				System.out.printf("%3d ", x);
			}
			System.out.println();
		}
	}

}
