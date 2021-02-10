package p04_operatory;

public class Leniwosc4 {
	public static void main(String[] args) {
		// z prawdopodobieństwem 0.33 na imie wpisz nulla
		// z prawdopodobieństwem 0.33 na imie wpisz "Ala"
		// z prawdopodobieństwem 0.34 na imie wpisz "Tadeusz"
		double los = Math.random();
		String imie;
		if(los < 0.33) {
			imie = null;
		} else if(los < 0.66) {
			imie = "Ala";
		} else {
			imie = "Tadeusz";
		}
		
		System.out.println("imie = " + imie);
		
//		if(imie != null & imie.length() >= 5) {
//			System.out.println("długie imię");
//		} else {
//			System.out.println("null albo krótkie imię");
//		}

		// jeśli imie będzie null, to w ogóle nie przejdziemy do drugiej części sprawdzenia
		if(imie != null && imie.length() >= 5) {
			System.out.println("długie imię");
		} else {
			System.out.println("null albo krótkie imię");
		}
		
		if(imie == null || imie.isEmpty()) {
			System.out.println("Brak danych");
		}

		if(args.length >= 1 && "Ala".equalsIgnoreCase(args[0])) {
			System.out.println("Ala ma kota");
		}
	}
	
}
