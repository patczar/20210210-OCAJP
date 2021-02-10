package p03_instrukcje.przyklady;

public class TabliczkaMnozenia2 {

	public static void main(String[] args) {
		final int N = 10;
		
		for(int w = 1; w <= N; w++) {
			for(int k = 1; k <= N; k++) {
				System.out.printf("%3d ", w*k);
			}
			System.out.println();
		}
	}

}
