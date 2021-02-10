package p23_wrappery;

public class Wrappery4 {

	public static void main(String[] args) {
		Integer x, y;
		
		// autoboxing
		x = 100;
		
		// tak naprawdę jest tłumaczony na:
		x = Integer.valueOf(100);
		y = Integer.valueOf(100); // zwraca dowiązanie do tego  samego obiektu, o ile w przedziale [-128, 127]
		System.out.println(x == y);  // porównanie referencji (adressów, "czy to ten sam obiekt")
		
		x = new Integer(100);  // new ZAWSZE tworzy nowy obiekt
		y = new Integer(100);
		System.out.println(x == y); // F , porównywane są Integery, a więc referencje
		
		System.out.println(x.equals(y)); // T
		
		System.out.println(x + 0 == y);  // T, bo tutaj porównywane są int-y
		
		int a = x;
		int b = y;
		System.out.println(a == b); // T
	}

}
