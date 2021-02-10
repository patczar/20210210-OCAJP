package p07_tablice;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class SredniaLiczb {

	public static void main(String[] args) {
		// Tablica zawiera liczby.
		// Przyjmijmy, że są to temperatury zmierzone w kolejne dni tygodnia... :)
		
		double[] t = {5.5, 6.7, 9.1, 7.0, 4.0, 6.7, 10};
		System.out.println(Arrays.toString(t));
		
		// Zadanie: oblicz średnią z tych liczb
		
		// sposób prosty, ale nieprofesjonalny - "nie skaluje się", tzn. nie da się zastosować dla dużo większych tablic
		// każda zmiana ilości liczb wymaga zmian w kodzie
		double srednia1 = (t[0] + t[1] + t[2] + t[3] + t[4] + t[5] + t[6]) / 7;
		System.out.println(srednia1);
		
		
		// wersja przejściowa, tylko żeby znowu wytłumaczyć "schemat ze skarbonką"
		
		double suma2 = 0;
		suma2 += t[0];
		suma2 += t[1];
		suma2 += t[2];
		suma2 += t[3];
		suma2 += t[4];
		suma2 += t[5];
		suma2 += t[6];
		
		double srednia2 = suma2 / t.length;
		System.out.println(srednia2);
		
		// zamiast 7 raz pisać podobną linię kodu, mogę raz umieścić ją w pętli
		// Ta wersja już zadziała dla tablic dowolnej wielkości.
		double suma3 = 0;
		for(int i = 0; i < t.length; i++) {
			suma3 += t[i];
		}
		double srednia3 = suma3 / t.length;
		System.out.println(srednia3);
		
		
		// wersja z pętlą "for-each"
		
		double suma4 = 0;
		for (double liczba : t) {
			suma4 += liczba;
		}
		double srednia4 = suma4 / t.length;
		System.out.println(srednia4);
		
		// istnieją gotowe rozwiązania
		
		OptionalDouble srednia5 = DoubleStream.of(t).average();
		if(srednia5.isPresent()) {
			System.out.println(srednia5.getAsDouble());
		} else {
			System.out.println("nie ma średniej, bo pusta tablica");
		}
	}

}
