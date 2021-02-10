package p01_interakcja.konsola;

import java.io.IOException;
import java.util.Arrays;

public class StandardoweWejscie2 {

	public static void main(String[] args) throws IOException {
		System.out.println("Napisz coś");
			
		// Można też wczytać całą porcję bajtów do tablicy
		byte[] bajty = new byte[100];
		int ile = System.in.read(bajty);
		
		System.out.println("Odczytano " + ile + " bajtów.");
		System.out.println(Arrays.toString(bajty));
		
		// Można utworzyć napis na podstawie ciągu bajtów:
		
		String napis = new String(bajty, 0, ile);
		System.out.println("Napisałeś: " + napis);
 
	}

}
