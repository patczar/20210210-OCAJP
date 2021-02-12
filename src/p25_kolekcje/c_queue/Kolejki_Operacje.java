package p25_kolekcje.c_queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Kolejki_Operacje {

	public static void main(String[] args) {
		Deque<String> kolejka = new ArrayDeque<String>(
				Arrays.asList("Ala", "Ula", "Ola", "Kasia"));
		
		
		System.out.println(kolejka);
		
		// odczyt bez usuwania, zwracają null jeśli kolejka jest pusta
		System.out.println("peek / peekFirst / peekLast");
		System.out.println(kolejka.peek());
		System.out.println(kolejka.peekFirst());
		System.out.println(kolejka.peekLast());
		System.out.println();
		
		// odczyt bez usuwania, wyrzucają wyjątek jeśli kolejka jest pusta
		System.out.println("element / getFirst / getLast");
		System.out.println(kolejka.element());
		System.out.println(kolejka.getFirst());
		System.out.println(kolejka.getLast());
		System.out.println();
		
		// dodawanie na końcu i na początku
		kolejka.add("Zosia");
		kolejka.addLast("Zuzia");
		kolejka.addFirst("Ania");
		System.out.println(kolejka);

		kolejka.offer("Zosia 2");
		kolejka.offerLast("Zuzia 2");
		kolejka.offerFirst("Ania 2");
		System.out.println(kolejka);
		System.out.println();
		
		// usuwanie - poll zwracają null jeśli kolejka jest pusta
		String s;
		s = kolejka.poll(); // pobiera i usuwa pierwszy element
		System.out.println(s);
		s = kolejka.pollFirst();
		System.out.println(s);
		s = kolejka.pollLast();
		System.out.println(s);
		System.out.println();

		// usuwanie - remove wyrzucają wyjątek jeśli kolejka jest pusta
		s = kolejka.remove();
		System.out.println(s);
		s = kolejka.removeFirst();
		System.out.println(s);
		s = kolejka.removeLast();
		System.out.println(s);
		System.out.println();
		
		kolejka.add("Zosia");
		kolejka.add("Ola");
		System.out.println(kolejka);
		// [Ola, Kasia, Zosia, Zuzia, Zosia, Ola]
		
		boolean b;
		b = kolejka.remove("Ola"); // usuwa jedno wystąpienie, równoważne removeFirstOccurrence
		System.out.println(kolejka);
		
		kolejka.removeLastOccurrence("Zosia");
		System.out.println(kolejka);
		
	}
}
