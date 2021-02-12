package p25_kolekcje.b_set_map;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Tree2 {

	public static void main(String[] args) {
		
		NavigableSet<String> imiona = new TreeSet<>(
				Arrays.asList("Ala", "Ola", "Ula", "Ela", "Ewa", "Ania", "Kasia", "Aga", "Iwona", "Magda", "Iza"));

		
		System.out.println(imiona);
		
		System.out.println("first: " + imiona.first());
		System.out.println("last : " + imiona.last());
		
		System.out.println(imiona);
		System.out.println();
		
		System.out.println("pętla first / higher");
		String s = imiona.first();
		while(s != null) {
			System.out.println(s);
			s = imiona.higher(s);
		}
		System.out.println("========================");
		System.out.println("pętla last / lower");
		s = imiona.last();
		while(s != null) {
			System.out.println(s);
			s = imiona.lower(s);
		}
		
		System.out.println("========================");
		System.out.println("pętla poll - usuwanie");
		System.out.println("size: " + imiona.size());
		
		while((s = imiona.pollFirst()) != null) {
			System.out.println(" # " + s);
		}
		
		System.out.println("size: " + imiona.size());
		// analogicznie pollLast()
	}

}
