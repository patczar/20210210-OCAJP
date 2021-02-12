package p30_lambdy.v2;

import java.util.Arrays;

// To już jest kod pisany na co dzień przez zwykłych programistów,
// który używają gotowych schematów.
// Tutaj już nie wywołuję metody oblicz (bezpośrednoio)
// nie używam nawet nazwy "FumnkcjaLiczbowa"
// tylko korzystam z gotowehgo schematu, do którego przekazuję funkcję zapisaną jako labda.
public class UzycieFrameworku {

	public static void main(String[] args) {
        double[] a = {0, 10, 20, 30, 40, 50};
        double[] b = {100, 16, 25, 2};
        
        System.out.println("a: " + Arrays.toString(a));
        System.out.println("b: " + Arrays.toString(b));
        System.out.println();
        
        // tutaj mogę w wygodny sposób podawać funkcje
        // Chcę wszystkie liczby z tablicy a podnieść do kwadratu...
        MojFrameworkFunkcyjny.podmien(a, x -> x*x);

        // Wszystkie liczby w tablicy b chcę zamienić na ich pierwiastki...
        MojFrameworkFunkcyjny.podmien(b, Math::sqrt);
        
        System.out.println("a: " + Arrays.toString(a));
        System.out.println("b: " + Arrays.toString(b));
        
	}

}
