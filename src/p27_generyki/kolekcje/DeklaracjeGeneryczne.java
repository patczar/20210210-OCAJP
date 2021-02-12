package p27_generyki.kolekcje;

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
		List l6a = new ArrayList<String>();

		//NK List<> l7 = new ArrayList<String>();
		
		List<List<Integer>> l8 = new ArrayList<>();
		//NK List<List<Integer>> l9 = new ArrayList<<>>();
		//NK List<List<Integer>> l10 = new ArrayList<List<>>();
		List<List<Integer>> l11 = new ArrayList<List<Integer>>();

		//NK List<Object> l12 = new ArrayList<String>();
		//NK List<String> l13 = new ArrayList<Object>();

		List<? extends Object> l14 = new ArrayList<String>();
		List<?> l15 = new ArrayList<String>(); // sam ? jest równoważny ? extends Object
		
		//NK List<?> foo1 = new ArrayList<? extends Number>();
		//NK List<?> foo2 = new ArrayList<? super Number>();
		//NK List<?> foo3 = new ArrayList<?>();
	}

}
