package p10_klasy.v6_polimorfizm;

import java.util.Collection;
import java.util.HashSet;

public class Zastosowania {

	public static void main(String[] args) {
		// Przykłady zastosowania overridingu i polimorfizmu
		
		//Collection<String> kolekcja = new ArrayList<>();
		Collection<String> kolekcja = new HashSet<>();
		kolekcja.add("Ala");
		kolekcja.add("Ola");
		kolekcja.add("Ala");
		kolekcja.add("Ula");
		System.out.println(kolekcja);
		System.out.println();
		
//		Connection connection = DriverManager.getConnection("jdbc:mysql://serwer/baza");
//		// Connection connection = DriverManager.getConnection("jdbc:postgresql://serwer/baza");
//		
//		connection.prepareStatement("SELECT * FROM table").execute();

	}

}
