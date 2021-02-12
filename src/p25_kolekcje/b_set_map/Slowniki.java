package p25_kolekcje.b_set_map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Slowniki {

	public static void main(String[] args) {
		HashMap<String, Integer> hasz = new HashMap<>();
		LinkedHashMap<String, Integer> linkedHasz = new LinkedHashMap<>();
		TreeMap<String, Integer> drzewo = new TreeMap<>();
		
		hasz.put("ala", 20); drzewo.put("ala", 20); linkedHasz.put("ala", 20);
		hasz.put("ola", 30); drzewo.put("ola", 20); linkedHasz.put("ola", 30);
		hasz.put("ela", 20); drzewo.put("ela", 20); linkedHasz.put("ela", 20);
		hasz.put("ula", 55); drzewo.put("ula", 55); linkedHasz.put("ula", 55);
		
		
		System.out.println(hasz.get("ela")); //20
		System.out.println(hasz.get("ewa")); //null
		
		System.out.println(hasz.containsKey("ela")); // szybkie
		System.out.println(hasz.containsValue(55)); // wolne
		
		System.out.println("\nTreeMap:       "+drzewo);
		System.out.println("HashMap:       "+hasz);
		System.out.println("LinkedHashMap: "+linkedHasz);
		System.out.println("====================================\n");

		hasz.put("ola", 31); drzewo.put("ola", 31); linkedHasz.put("ola", 31);

		System.out.println("TreeMap:       "+drzewo);
		System.out.println("HashMap:       "+hasz);
		System.out.println("LinkedHashMap: "+linkedHasz);
		
		System.out.println("\nWszystkie wpisy:");
		for(Map.Entry<String, Integer> entry : drzewo.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		
		System.out.println("\nWszystkie klucze:");
		for(String s : drzewo.keySet()) {
			System.out.println(s);
		}

		System.out.println("\nWszystkie wartości:");
		for(Integer i : drzewo.values()) {
			System.out.println(i);
		}
		
		// Można też przypisać na zmienne:
		Set<Map.Entry<String, Integer>> zbiorWpisow = hasz.entrySet();
		Set<String> klucze = hasz.keySet();
		Collection<Integer> wartosci = hasz.values();
		
		// Jak zrobić listę kluczy?
		List<String> kluczel = new ArrayList<>(hasz.keySet());
	}
}
