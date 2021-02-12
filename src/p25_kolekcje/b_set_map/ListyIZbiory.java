package p25_kolekcje.b_set_map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class ListyIZbiory {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		LinkedList<String> lista = new LinkedList<>();
		HashSet<String> hasz = new HashSet<>();
		LinkedHashSet<String> linkedHasz = new LinkedHashSet<>();
		TreeSet<String> drzewo = new TreeSet<>();
		
		al.add("ala"); lista.add("ala"); drzewo.add("ala"); hasz.add("ala"); linkedHasz.add("ala");
		al.add("ola"); lista.add("ola"); drzewo.add("ola"); hasz.add("ola"); linkedHasz.add("ola");
		al.add("ela"); lista.add("ela"); drzewo.add("ela"); hasz.add("ela"); linkedHasz.add("ela");
		al.add("ula"); lista.add("ula"); drzewo.add("ula"); hasz.add("ula"); linkedHasz.add("ula");
		al.add("ola"); lista.add("ola"); drzewo.add("ola"); hasz.add("ola"); linkedHasz.add("ola");

		System.out.println("ArrayList:     "+al);
		System.out.println("LinkedList:    "+lista);
		System.out.println("TreeSet:       "+drzewo);
		System.out.println("HashSet:       "+hasz);
		System.out.println("LinkedHashSet: "+linkedHasz);
		System.out.println();
		
		// dla wszystkich list wolno działa operacja contains / indexOf
		System.out.println(al.contains("ela"));

		// dla wszystkich zbiorów szybko działa operacja contains
		System.out.println(hasz.contains("ela"));

	}
}
