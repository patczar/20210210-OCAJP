package p27_generyki.techniczne;

import java.time.LocalDate;

public class MetodyInstancyjne<A> {
	// Metody mogą być parametryzowane typami generycznymi - każda niezależnie.
	// Te parametry nie mają nic wspólnego z parametreami na poziomie klasy, w której jesteśmy (gdyby takie były).

	A aaa(A a) {
		System.out.println("a = " + a);
		return a;
	}

	// A jest parametrem ustalonym na poziomie klasy, a B na poziomie metody
	<B> B bbb(A a, B b) {
		System.out.println("a = " + a + " , b = " + b);
		return b;
	}
	
	// Parametr podany na poziomie metody może przesłonić parametr podany na poziomie klasy
	<A> A ccc(A a) {
		System.out.println("a = " + a);
		return a;
	}
	

	public static void main(String[] args) {
		MetodyInstancyjne<String> instancjaString = new MetodyInstancyjne<>();

		MetodyInstancyjne<Integer> instancjaInteger = new MetodyInstancyjne<>();
		
		String s1 = instancjaString.aaa("Ala");
		System.out.println(s1);
		// LocalDate s2 = instancjaString.aaa(LocalDate.now());
		
		// Na pierwszym parametrze musi być String,
		// na drugim może być cokolwiek. Typ metody mówi, że wynik jest tego samego typu, co drugi argument.
		String s3 = instancjaString.bbb("Ala", "Ola");
		System.out.println(s3);
		
		LocalDate s4 = instancjaString.bbb("Ala", LocalDate.now());
		System.out.println(s4);
		
		LocalDate s5 = instancjaInteger.bbb(123, LocalDate.now());
		System.out.println(s5);
		
		LocalDate s6 = instancjaString.ccc(LocalDate.now());
		System.out.println(s6);
		
		
	}

}
