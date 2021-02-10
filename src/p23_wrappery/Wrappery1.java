package p23_wrappery;

import java.util.ArrayList;
import java.util.List;

public class Wrappery1 {
	
	public static Integer min(int[] tab) {
		if(tab.length == 0)
			return null;
		
		int min = Integer.MAX_VALUE;
		
		for(int x : tab) {
			if(x < min) {
				min = x;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		int[] a = {100, 44, 20, 50, 11, 33, 22};
		int[] b = {2147483647, 2147483647, 2147483647};
		int[] c = {};
		
		// 1) Motywacja dla wrapperów:
		// powiedzieć, że "nie ma wyniku" albo "wynik jest pusty"
		// za pomocą wartości null
		
		System.out.println(min(a));
		System.out.println(min(b));
		System.out.println(min(c));
		System.out.println();
		
		// 2) Motywacja: kolekcje
		//NK List<int> lista = new ArrayList<>();
		List<Integer> lista = new ArrayList<>();
		lista.add(new Integer(5));
		
		lista.add(77);  // automatyczny boxing
		int element = lista.get(0); // automatyczny outboxing
		
		System.out.println(lista + " " + element);
		
	}

}
