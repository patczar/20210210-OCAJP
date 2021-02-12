package p31_streamy.a2_przeglad_operacji;

import java.util.stream.Stream;

public class FilterMap {

	public static void main(String[] args) {
		String[] imiona = {"Ala", "Ola", "Basia", "Kasia", "Ela", "Ula", "Agnieszka", "Magdalena", "Anna", "Hanna", "Joanna", "Ala", "Agata", "Genowefa", "Grażyna", "Karolina", "Julia", "Zuzanna"};

		Stream.of(imiona)
			.filter(s -> s.length() >= 5)
			.forEach(System.out::println);
		System.out.println();
		
		Stream.of(imiona)
			.map(String::toUpperCase)
			.forEach(System.out::println);
		System.out.println();
		
		Stream.of(imiona)
			.filter(s -> s.startsWith("A"))
			.map(String::length)  // String -> Integer
			.forEach(System.out::println);		
	}

}
