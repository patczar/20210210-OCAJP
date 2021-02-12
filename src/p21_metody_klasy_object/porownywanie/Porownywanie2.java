package p21_metody_klasy_object.porownywanie;

import java.util.HashSet;

// Ta wersja nie nadpisuje equals! Tylko dodaje inną metodę

class B {
	int x, y;

	public B(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "(" + x + "," + y +")";
	}
	
	public boolean equals(B that) {
		return this.x == that.x && this.y == that.y;
	}
	
	public int hashCode() {
		return 0;
	}
}

public class Porownywanie2 {

	public static void main(String[] args) {
		B b1 = new B(10, 20);
		B b2 = new B(10, 20);
		B b3 = new B(10, 30);
		
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println(b3.toString());
		
		System.out.println(b1 == b2);
		System.out.println(b1 == b3);
		System.out.println();
		
		// chociaż nieprawidłowo zaimplementowałem equals w klasie B, to ten test działa
		System.out.println(b1.equals(b2));
		System.out.println(b1.equals(b3));
		System.out.println();
		
		Object o1 = b1;
		Object o2 = b2;
		Object o3 = b3;
		System.out.println(o1.equals(o2)); // tu działa wersja z Object
		System.out.println(o1.equals(o3));
		System.out.println();
		
		HashSet<B> zbior = new HashSet<>();
		zbior.add(b1);
		zbior.add(b2);
		zbior.add(b3);
		System.out.println(zbior.size());
		System.out.println(zbior);
	}

}
