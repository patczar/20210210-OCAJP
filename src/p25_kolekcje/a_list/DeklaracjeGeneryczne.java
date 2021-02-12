package p25_kolekcje.a_list;

import java.util.ArrayList;
import java.util.List;

public class DeklaracjeGeneryczne {

	public static void main(String[] args) {
		List l1 = new ArrayList();
		ArrayList l2 = new ArrayList();
		List<String> l3 = new ArrayList<String>();
		List<String> l4 = new ArrayList<>();   // diamond operator od Javy 7
		List<String> l5 = new ArrayList();
		List l6 = new ArrayList<>();  // lista Object-ów

		//NK List<> l7 = new ArrayList<String>();
		
		List<List<Integer>> l8 = new ArrayList<>();
		//NK List<List<Integer>> l9 = new ArrayList<<>>();
		//NK List<List<Integer>> l10 = new ArrayList<List<>>();
		List<List<Integer>> l11 = new ArrayList<List<Integer>>();
		
		//NK List<int> l12 = new ArrayList<>();
		List<int[]> l13 = new ArrayList<>();
		
		// "lista nie wiadomo czego"
		// w praktyce takiej listy mogę używać tylko do odczytu, nie mogę w niej niczego zapisać
		List<?> l14 = new ArrayList<>();
		List<?> l15 = new ArrayList<String>();
		// l15.add("ala");
		
		// to nie to samo, co lista Objectów, bo np lista Stringów nie jest tym samym co lista Objectów, i nie można wpisać
		//NK List<Object> l16 = new ArrayList<String>();

	}

}
