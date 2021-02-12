package p25_kolekcje.a_list;

import java.util.ArrayList;
import java.util.List;

public class ListyAll {

	public static void main(String[] args) {
		List<String> a = new ArrayList<>();
		a.add("Ala");
		a.add("Ola");
		a.add("Ela");
		a.add("Ula");
		System.out.println("a = " + a);
		
		List<String> b = new ArrayList<>(a);
		System.out.println("a = " + b);
		
		List<String> c = new ArrayList<>();
		c.add("Ala");
		c.add("Ula");
		System.out.println("c = " + c);
		
		List<String> d = new ArrayList<>();
		d.add("Ala");
		d.add("Gosia");
		System.out.println("d = " + d);
		d.addAll(a);		
		System.out.println("d = " + d);
		
		System.out.println(a.containsAll(c)); // T
		System.out.println(c.containsAll(a)); // F

		c.add("Basia"); // nie ma w a
		System.out.println("c = " + c);

		boolean czy = a.removeAll(c);
		System.out.println(czy); // T
		
		System.out.println("a = " + a); // usunął Ala i Ula, a nie przejął się Basią
		System.out.println();
		
		a.add("Genowefa");
		a.add("Hermenegilda");
		a.add("Genowefa");
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		// zostawia w liście a tylko te elementy, które wystepują w b
		czy = a.retainAll(b);
		System.out.println("retainAll " + b);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
	}
}
