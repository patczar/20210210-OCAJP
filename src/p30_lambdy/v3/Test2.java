package p30_lambdy.v3;

import java.util.function.DoubleUnaryOperator;

public class Test2 {

	public static void main(String[] args) {
		FunkcjaLiczbowa razy2 = x -> x*2;
		FunkcjaLiczbowa razy10 = x -> x*10;
		FunkcjaLiczbowa plus3 = x -> x+3;
		FunkcjaLiczbowa kwadrat = x -> x*x;
		FunkcjaLiczbowa pierwiastek = Math::sqrt;
		
		
		System.out.println(razy2.oblicz(10));
		
		FunkcjaLiczbowa zlozenie1 = razy10.zloz(plus3);
		System.out.println(zlozenie1.oblicz(10));
		
		FunkcjaLiczbowa zlozenie2 = kwadrat.zloz(pierwiastek);
		System.out.println(zlozenie2.oblicz(10));
		System.out.println(zlozenie2.oblicz(50));
		System.out.println(zlozenie2.oblicz(5.5));

		FunkcjaLiczbowa zlozenie3 = pierwiastek.zloz(kwadrat);
		System.out.println(zlozenie3.oblicz(2));
		
		FunkcjaLiczbowa zlozenie4 = pierwiastek.zloz(pierwiastek);
		System.out.println(zlozenie4.oblicz(10000));
		System.out.println(zlozenie4.oblicz(625));
		
		FunkcjaLiczbowa ident = FunkcjaLiczbowa.identycznosc();
		System.out.println(ident.oblicz(113)); // 113
		
		System.out.println(kwadrat.podwojnie(3)); // 81
		
		
		// Takie rzeczy naprawdę istnieją:
		DoubleUnaryOperator f1 = Math::sqrt;
		DoubleUnaryOperator f2 = y -> y*y;
		DoubleUnaryOperator f3 = f1.andThen(f2);
		
		System.out.println(f3.applyAsDouble(2));
		System.out.println(f1.andThen(f1).applyAsDouble(625));
	}

}
