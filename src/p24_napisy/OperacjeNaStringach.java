package p24_napisy;

public class OperacjeNaStringach {

	public static void main(String[] args) {
		String napis = "Ala ma kota";
		System.out.println(napis);

		napis.concat(" Filemona");
		napis.replace("Ala", "Alicja");
		System.out.println(napis);  // napis się nie zmienił
		System.out.println();
		
		napis = napis.concat(" Bonifacego");
		System.out.println(napis);  // teraz zmieniony

		System.out.println("\nMetody informacyjne");
		System.out.println(napis.length());
		System.out.println(napis.charAt(2)); // numeracja od 0
		//EXN System.out.println(napis.charAt(30));
		System.out.println(napis.codePointAt(2));  // kod Unicode
		
		System.out.println("\nSprawdzanie czy zawiera fragment");
		// istotna jest też wielkośc liter
		System.out.println(napis.contains("kot"));
		System.out.println(napis.startsWith("Ala"));
		System.out.println(napis.endsWith("kot"));
		System.out.println(napis.equals("ala ma kota bonifacego")); // F
		// a to nie patrzy na wielkość liter
		System.out.println(napis.equalsIgnoreCase("ala ma kota bOnIfAcEgO")); // T
		
		System.out.println("\nWyszukiwanie");
		System.out.println(napis.indexOf("ma"));
		System.out.println(napis.indexOf("pies")); // -1
		System.out.println(napis.indexOf('a'));  //2 
		System.out.println(napis.indexOf('a', 3));  //5 bo szukam litery a od pozycji nr 3
		System.out.println(napis.lastIndexOf('a')); // ostatnie a w napisie
		
		System.out.println("\nMetody zwracające zmieniony napis");
		System.out.println(napis.concat(" i jeszcze psa Reksia"));
		System.out.println("|"+napis.substring(7, 15)+"|"); // od 7 włącznie, do 15 wyłączając; 15-7 = 8, 8 to jest długość wynikowego słowa
		// System.out.println("|"+napis.substring(7, 35)+"|"); // jeśli podamy pozycję spoza napisu, to wyjątek
		System.out.println("|"+napis.substring(7)+"|"); // od 7 do końca

		System.out.println(napis.toLowerCase());
		System.out.println(napis.toUpperCase());
		// replace zamienia wszystkie wystąpienia
		System.out.println(napis.replace(' ', '_'));
		System.out.println(napis.replace("ma", "posiada"));

		// Działa na wyrażeniach regularnych.
		// Ten przykład zamienia pierwsze litery słów (po spacjach)
		System.out.println(napis.replaceAll(" .", " X"));
	}
}
