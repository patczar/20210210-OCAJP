package p25_kolekcje.b_set_map;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class Tree1 {

	public static void main(String[] args) {
		
		// TreeSet implementuje dodatkowe interfejsy:
		// SortedSet<String>
		// NavigableSet<String>
		TreeSet<String> imiona = new TreeSet<>(
				Arrays.asList("Ala", "Ola", "Ula", "Ela", "Ewa", "Ania", "Kasia", "Aga", "Iwona", "Magda", "Iza"));
		
		
		System.out.println(imiona);
		
		SortedSet<String> head1 = imiona.headSet("Iwona");
		System.out.println(head1); // obejmuje wszystkie elementy < Iwona
		
		SortedSet<String> head2 = imiona.headSet("Iwona", true);
		System.out.println(head2); // obejmuje wszystkie elementy <= Iwona

		SortedSet<String> tail1 = imiona.tailSet("Iwona");
		System.out.println(tail1); // obejmuje wszystkie elementy >= Iwona
		
		SortedSet<String> tail2 = imiona.tailSet("Iwona", false);
		System.out.println(tail2); // obejmuje wszystkie elementy > Iwona
		// headSet i tailSet (bez parametru inclusive) dają łącznie cały zbiór
		System.out.println();
		
		// Jako granicę można podawać także elementy niewystępujące w kolekcji
		SortedSet<String> head3 = imiona.headSet("Jola");
		System.out.println(head3);
		
		SortedSet<String> sub1 = imiona.subSet("Ela", "Iwona"); // domyslnie inclusive: true / false
		System.out.println(sub1);

		SortedSet<String> sub2 = imiona.subSet("Ela", true, "Iwona", true);
		System.out.println(sub2);
		System.out.println("\n############");
		
		// to są "widoki", a nie kopie - zmiany w zbiorze pierwotnym są od razu widziane przez pobrane obiekty head/tail
		System.out.println("Dodaję elementy...");
		imiona.add("Julia");
		imiona.add("Ewelina");
		System.out.println(imiona);
		System.out.println(head1);
		System.out.println(tail1);
		System.out.println();
		
		System.out.println("head.add(Basia)");
		head1.add("Basia");
		System.out.println(imiona);
		System.out.println(head1);
		System.out.println(tail1);
		System.out.println();
		
		System.out.println("head.remove(Ewa)");
		System.out.println("head.remove(Magda)");
		head1.remove("Ewa");
		head1.remove("Zosia"); // nie ma takiego elementu, nie ma błędu
		head1.remove("Magda"); // nie usuwa, nie ma błędu
		System.out.println(imiona);
		System.out.println(head1);
		System.out.println(tail1);
		System.out.println();		
		
		System.out.println("head.add(Zosia)");
		head1.add("Zosia"); // IllegalArgumentException: key out of range
		System.out.println(imiona);
		System.out.println(head1);
		System.out.println(tail1);
		System.out.println();
	}

}
