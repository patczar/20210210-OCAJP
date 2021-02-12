package p25_kolekcje.b_set_map;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class NoweOperacjeMap {

	public static void main(String[] args) {
		TreeMap<String, Integer> map = new TreeMap<>();
		map.put("Ala", 20);
		map.put("Ola", 30);
		System.out.println(map);
		
		map.putIfAbsent("Ala", 25); // nie wpisuje
		map.putIfAbsent("Ela", 45); // wpisuje
		System.out.println(map);
		
		map.replace("Ala", 28); // zamienia
		map.replace("Ula", 48); // nic się nie dzieje
		System.out.println(map);
		
		map.replace("Ala", 40, 41); // jeśli taka była poprzednia wartość - tutaj nic się nie stanie
		System.out.println(map);
		
		map.replaceAll((k, v) -> v+1); // zwiększa wszystkie wartości o 1
		System.out.println(map);

		map.replaceAll((k, v) -> k.startsWith("A") ? v+1 : v); // zwiększa o 1 tylko słowa na literę A
		System.out.println(map);
		
		// dodaje nowy wpis z wartością 10, albo dodaje 10 do istniejącej wartości
		map.merge("Ola", 10, Math::addExact); // (x,y) -> x+y
		map.merge("Ewa", 10, Math::addExact);
		System.out.println(map);
		System.out.println();

		// Zamiast pętli, możena elementy przeglądać w ten sposób:
		map.forEach((k, v) -> {
			System.out.println("Klucz " + k + " ma wartość " + v);
		});
	}

}
