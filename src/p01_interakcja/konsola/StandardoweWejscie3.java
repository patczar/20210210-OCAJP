package p01_interakcja.konsola;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Aby czytać wejście linia po linii, można uzyć klas Scanner (inny przykład) lub BufferedReader (tutaj).
// Pośrednio potrzebna jest klasa InputStreamReader.

// Gdybyśmy chcieli podać własne kodowane znaków (inne niż systemowe), to wtedy:
// InputStreamReader isr = new InputStreamReader(System.in, "utf-8");

public class StandardoweWejscie3 {
	public static void main(String[] args) {
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String wiersz;
			while((wiersz = br.readLine()) != null) {
				System.out.println("Napisałeś "+wiersz);
				if("koniec".equals(wiersz))
					break;
			}
			
			System.out.println("KONIEC");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
