package p25_kolekcje.a_list;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class NoweOperacjeList {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();
		lista.add("Ala");
		lista.add("Ola");
		lista.add("Kasia");
		lista.add("Ela");
		lista.add("Łucja");
		lista.add("Ula");
		lista.add("Asia");
		lista.add("Zosia");
		
		System.out.println(lista);
		System.out.println();
		
		lista.sort(null);
//		lista.sort(Comparator.reverseOrder());
		lista.sort(Collator.getInstance());
//		lista.sort(Collator.getInstance(Locale.CHINA));
//		lista.sort(Collator.getInstance().reversed());

		System.out.println(lista);
		System.out.println();
				
		lista.forEach(s -> System.out.print(s + ", "));
		System.out.println();
		System.out.println();
		
		List<String> lista1 = (List<String>)lista.clone();
		System.out.println(lista1);
		// predykat; operacja usuwa z listy wszystkie spełaniające warunek
		lista1.removeIf(s -> s.length() <= 3);
		System.out.println(lista1);
		System.out.println();
		
		List<String> lista2 = (List<String>)lista.clone();
		System.out.println(lista2);
		lista2.replaceAll(s -> s.toUpperCase()); // lambda expression
		// lista2.replaceAll(String::toUpperCase);  // method reference - w tym przypadku równoważnie
		System.out.println(lista2);
		System.out.println();
	}

}
