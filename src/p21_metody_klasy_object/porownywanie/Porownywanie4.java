package p21_metody_klasy_object.porownywanie;

import java.util.HashSet;

class D {
	int x, y;

	public D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "(" + x + "," + y +")";
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof D) {
			D that = (D)o;
			return this.x == that.x && this.y == that.y;
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		// poprawnym hashCode będzie każdy, który do uzyskania wyniku używa wyłącznie wartości porównywanych w equals
		return x*y;
	}
}

public class Porownywanie4 {

	public static void main(String[] args) {
		D d1 = new D(10, 20);
		D d2 = new D(10, 20);
		D d3 = new D(10, 30);
		
		System.out.println(d1.toString());
		System.out.println(d2.toString());
		System.out.println(d3.toString());
		
		System.out.println(d1 == d2);
		System.out.println(d1 == d3);
		System.out.println();
		
		// chociaż nieprawidłowo zaimplementowałem equals w klasie B, to ten test działa
		System.out.println(d1.equals(d2));
		System.out.println(d1.equals(d3));
		System.out.println();
		
		Object o1 = d1;
		Object o2 = d2;
		Object o3 = d3;
		System.out.println(o1.equals(o2)); // tu działa wersja z Object
		System.out.println(o1.equals(o3));
		System.out.println();
		
		HashSet<D> zbior = new HashSet<>();
		zbior.add(d1);
		zbior.add(d2);
		zbior.add(d3);
		System.out.println(zbior.size());
		System.out.println(zbior);
	}

}
