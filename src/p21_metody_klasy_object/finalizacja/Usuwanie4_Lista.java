package p21_metody_klasy_object.finalizacja;

import java.util.LinkedList;
import java.util.List;

public class Usuwanie4_Lista {

	public static void main(String[] args) {
		Osoba osoba = new Osoba("Ala", "Kowalska", "1993-04-05");
		List<Konto> lista = new LinkedList<>();
		
		for(int i = 1; i <= 100; i++) {
			Konto k = new Konto(i, 100*i, osoba);
			lista.add(k);
		}		
		System.out.println("Konta utworzone");

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
		System.out.println(lista.get(50));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		System.out.println("Zapominam o liście i ponownie robię GC");
		lista = null;
		System.gc();
		System.out.println("GC odpalone");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		System.out.println("koniec");
		
	}

}
