package p21_metody_klasy_object.finalizacja;

import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;

public class Usuwanie5_Weak {

	public static void main(String[] args) {
		Osoba osoba = new Osoba("Ala", "Kowalska", "1993-04-05");
		List<WeakReference<Konto>> lista = new LinkedList<>();
		
		for(int i = 1; i <= 100; i++) {
			Konto k = new Konto(i, 100*i, osoba);
			lista.add(new WeakReference<Konto>(k));
		}
		System.out.println("Konta utworzone");
		
		System.out.println("przykładowe konto: " + lista.get(50).get());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		osoba = null;
		System.out.println("Odpalam GC");
		System.gc();
		System.out.println("GC odpalone");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		System.out.println("teraz odczyt konta: " + lista.get(50).get());
		System.out.println("koniec");
	}

}
