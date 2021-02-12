package p21_metody_klasy_object.porownywanie;

import java.util.HashSet;

class C {
	int x, y;

	public C(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "(" + x + "," + y +")";
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof C) {
			C that = (C)o;
			return this.x == that.x && this.y == that.y;
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		// taki hashCode jest poprawny, w tym sensie, że spełnia minimalne wymagania kontraktu
		// zazwyczaj taka implementacja jest niewydajna i w praktyce tak się nie robi
		return 0;
	}
}

public class Porownywanie3 {

	public static void main(String[] args) {
		C c1 = new C(10, 20);
		C c2 = new C(10, 20);
		C c3 = new C(10, 30);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		
		System.out.println(c1 == c2);
		System.out.println(c1 == c3);
		System.out.println();
		
		// chociaż nieprawidłowo zaimplementowałem equals w klasie B, to ten test działa
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println();
		
		Object o1 = c1;
		Object o2 = c2;
		Object o3 = c3;
		System.out.println(o1.equals(o2)); // tu działa wersja z Object
		System.out.println(o1.equals(o3));
		System.out.println();
		
		HashSet<C> zbior = new HashSet<>();
		zbior.add(c1);
		zbior.add(c2);
		zbior.add(c3);
		System.out.println(zbior.size());
		System.out.println(zbior);
	}

}
