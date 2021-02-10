package p04_operatory;

public class PlusPlus_Zastosowania {
	
	static int suma(int[] t) {
		int suma = 0;
		int i = 0;
		while(i < t.length) {
			suma += t[i++];
		}
		return suma;
	}

	public static void main(String[] args) {
		int[] a = {10, 20, 30, 40};
		System.out.println(suma(a));

	}
}
