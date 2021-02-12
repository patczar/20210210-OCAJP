package p30_lambdy.v1;

import java.util.ArrayList;
import java.util.List;

public class A_TypoweLambdy {
	
    public static void main(String[] args) {
    	List<String> lista = new ArrayList<>(List.of("Ala", "Agnieszka", "Ola", "Kasia", "Basia", "Jan", "Adam", "Dominika"));
    	System.out.println(lista);
       
    	lista.stream()
       			.filter(s -> s.endsWith("a"))
       			.map(s -> s.toUpperCase())
       			.sorted((s1, s2) -> s1.length() - s2.length())
       			.forEachOrdered(s -> System.out.println(s));
       
    	lista.removeIf(s -> s.startsWith("A"));
    	System.out.println(lista);
    	
    	lista.replaceAll(s -> s.replace('s', 'ś'));
    	System.out.println(lista);
    }
}

