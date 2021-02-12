package p21_metody_klasy_object.porownywanie;

class A {
	int x, y;

	public A(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "( " + x + "," + y +")";
	}
}

public class Porownywanie1 {

	public static void main(String[] args) {
		A a1 = new A(10, 20);
		A a2 = new A(10, 20);
		A a3 = new A(10, 30);
		
		System.out.println(a1 == a2);
		System.out.println(a1 == a3);
		System.out.println();
		
		System.out.println(a1.equals(a2));
		System.out.println(a1.equals(a3));
		

	}

}
