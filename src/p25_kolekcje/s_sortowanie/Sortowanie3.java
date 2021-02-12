package p25_kolekcje.s_sortowanie;

import java.text.Collator;
import java.util.Arrays;

public class Sortowanie3 {

	public static void main(String[] args) {
		String[] imiona = { "Ala", "Ola", "Iwona", "Magdalena", "Joanna", "Anna", "Teresa",
				"Żaneta", "Ęcki", "Ącki", "Agnieszka", "ala", "Łucja", "Julia", "Julitta", "Zuzanna" };
		
		System.out.println("Sortowanie tablicy");
		System.out.println(Arrays.toString(imiona));
		Arrays.sort(imiona);
		System.out.println(Arrays.toString(imiona));		
		Arrays.sort(imiona, Collator.getInstance()); // jako Comparator
		System.out.println(Arrays.toString(imiona));				
		Arrays.sort(imiona, (s1, s2) -> s1.length() - s2.length());
		System.out.println(Arrays.toString(imiona));		
	}
}
