package p31_streamy.a1_dzialanie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A_TypowyPrzyklad {

	public static void main(String[] args) {
		String[] tablica = { "Ala", "Ola", "Iwona", "Magdalena", "Joanna", "Anna", "Teresa",
				"Żaneta", "Ęcki", "Ącki", "Agnieszka", "ala", "Łucja", "Julia", "Julitta", "Zuzanna" };
		List<String> lista = new ArrayList<>(Arrays.asList(tablica));
		
		System.out.println(lista);
		System.out.println();
		
		lista.stream()
			.filter(s -> s.contains("a"))
			.map(s -> s.toUpperCase())
			.forEach(s -> System.out.println(s));
		
		
		// To odpowiada takiej pętli:
		for(String s1 : lista) {
			if(s1.contains("a")) {
				String s2 = s1.toUpperCase();
				System.out.println(s2);
			}
		}
	}

}
