package p03_instrukcje;

public class Przerwania {
	static void tabliczka(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.printf("%3d", i * j);

				System.out.print(",");
			}
			System.out.println("#");
		}
		System.out.println("\n----------------\n");
	}

	static void tabliczkaBreak(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.printf("%3d", i * j);
				if (i + j > n)
					break;
				System.out.print(",");
			}
			System.out.println("#");
		}
		System.out.println("\n----------------\n");
	}

	static void tabliczkaBreakEtykieta(int n) {
		pierwsza:
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.printf("%3d", i * j);
				if (i + j > n)
					break pierwsza;
				System.out.print(",");
			}
			System.out.println("#");
		}
		System.out.println("\n----------------\n");
	}

	static void tabliczkaContinue(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.printf("%3d", i * j);
				if (i + j > n)
					continue;
				System.out.print(",");
			}
			System.out.println("#");
		}
		System.out.println("\n----------------\n");
	}

	static void tabliczkaContinueEtykieta(int n) {
		pierwsza:
		for (int i = 1; i <= n; i++) {
			System.out.println(); // dodane
			for (int j = 1; j <= n; j++) {
				System.out.printf("%3d", i * j);
				if (i + j > n)
					continue pierwsza;
				System.out.print(",");
			}
			System.out.println("#");
		}
		System.out.println("\n----------------\n");
	}

	public static void main(String[] args) {
		tabliczka(9);
		tabliczkaBreak(9);
		tabliczkaBreakEtykieta(9);
		tabliczkaContinue(9);
		tabliczkaContinueEtykieta(9);
	}
}
