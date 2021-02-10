package p01_interakcja.konsola;

import java.io.Console;
import java.util.Arrays;

public class KlasaConsole {

	public static void main(String[] args) {
		System.out.println("Początek (stdout)");
		
		Console konsola = System.console();
		System.out.println("System.console() = " + konsola);
		
		if(konsola == null) return;
		
		String wiersz;
		while((wiersz = konsola.readLine("> ")) != null) {
			
			konsola.printf("Napisałeś %s %n", wiersz);
			if("koniec".equals(wiersz))
				break;
		}
		
		System.out.println("KONIEC");
		
		char[] hasło = konsola.readPassword("Podaj tajne hasło: ");
		konsola.printf("Hasło ma długość %d %n", hasło.length);
		Arrays.fill(hasło, 'X');
	}
}
