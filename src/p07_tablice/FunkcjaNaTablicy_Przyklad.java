package p07_tablice;

public class FunkcjaNaTablicy_Przyklad {
	
	static int suma(int[] t) {
		int wynik = 0;
		for (int el : t) {
			wynik += el;
		}
		return wynik;
	}

	public static void main(String[] args) {
		int[] a = {1, 3, 5, 7};
		int[] b = {10, -5, 15, -20, 0};
		int[] e = {};
		
		System.out.println("suma a: " + suma(a));
		System.out.println("suma b: " + suma(b));
		System.out.println("suma e: " + suma(e));
	}

}
