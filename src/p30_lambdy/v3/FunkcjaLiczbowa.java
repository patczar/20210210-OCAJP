package p30_lambdy.v3;

@FunctionalInterface
public interface FunkcjaLiczbowa {
	// interfejs funkcyjny może zawierać metody defaultowe i statyczne
	// ale ma zawierać dokładnie jedną metodę abstrakcyjną (czyli niezaimplementowaną)

	double oblicz(double arg);
	
	// aplikuje bieżącą funkcję podwójnie
	default double podwojnie(double arg) {
		return oblicz(oblicz(arg));
	}

	default FunkcjaLiczbowa zloz(FunkcjaLiczbowa nastepnyKrok) {
		return x -> {
			double wynikPosredni = oblicz(x);
			double wynikKoncowy = nastepnyKrok.oblicz(wynikPosredni);
			return wynikKoncowy;
		};
	}
	
	static FunkcjaLiczbowa identycznosc() {
		return x -> x;
	}
}
