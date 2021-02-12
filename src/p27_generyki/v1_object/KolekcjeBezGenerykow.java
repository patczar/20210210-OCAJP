package p27_generyki.v1_object;

import java.util.ArrayList;

public class KolekcjeBezGenerykow {

	public static void main(String[] args) {
		ArrayList lista = new ArrayList();
		lista.add("Ala");
		lista.add("Ola");
		lista.add(new Integer(50));
		System.out.println(lista);
		
		// W momencie wyjęcia obiektu z kolekcji, trzeba było dokonać rzutowania.
		String imie = (String)lista.get(1);
		System.out.println(imie);
		
		//EXN CCE imie = (String) lista.get(2);
		// System.out.println(imie);
	}

}
