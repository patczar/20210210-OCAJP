package p01_interakcja.konsola;

import java.io.IOException;

public class StandardoweWejscie1 {

	public static void main(String[] args) throws IOException {
		System.out.println("Napisz coś");
		
		// Wczytanie jednego bajtu z wejścia - w praktyce to co odczytamy jest kodem pierwszej litery
		int x = System.in.read();
		System.out.println("wartość x: " + x);
		

	}

}
