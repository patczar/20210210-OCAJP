package p25_kolekcje.c_queue;

import java.util.ArrayDeque;

public class KolejkaJakoStos {

	public static void main(String[] args) {
		ArrayDeque<Integer> stos = new ArrayDeque<>();
		System.out.println(stos);
		
		for(int i = 1; i < 10; i++) {
			System.out.println(i*i);
			stos.push(i*i);
		}
		
		System.out.println();
		System.out.println(stos);
		System.out.println();
		
		while(! stos.isEmpty()) {
			Integer liczba = stos.pop();
			System.out.println(liczba);
		}
	}
}
