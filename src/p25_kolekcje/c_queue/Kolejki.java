package p25_kolekcje.c_queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Kolejki {

	public static void main(String[] args) {
		Queue<String> kolejka; // ewentualnie Deque<String>
		String elem;
		
		System.out.println("Kolejka prosta:"); // FIFO
		kolejka = new ArrayDeque<>();
		// kolejka = new LinkedList<>();
		kolejka.add("ala");
		kolejka.add("ola");
		kolejka.add("ela");
		kolejka.add("ula");
		System.out.println("Cała: " + kolejka);
		System.out.println("Dodaję aaa");
		kolejka.add("aaa");
		System.out.println(kolejka);

		System.out.println("Wyjmuję w pętli:");
		while((elem = kolejka.poll()) != null ) {
			System.out.println(elem);
		}

		System.out.println("\nKolejka priorytetowa:");
		kolejka = new PriorityQueue<>();
		kolejka.add("ala");
		kolejka.add("ola");
		kolejka.add("ela");
		kolejka.add("ula");
		System.out.println("Cała: " + kolejka);

		System.out.println("Dodaję aaa");
		kolejka.add("aaa");
		System.out.println(kolejka);
		// jako pierwszy element w PriorityQueue występuje najmniejszy 
		

		System.out.println("Wyjmuję w pętli:");
		while((elem = kolejka.poll()) != null) {
			System.out.println(elem);	
		}
	}
}
