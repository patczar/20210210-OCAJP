package p30_lambdy.v3;

import static p30_lambdy.v3.ZastosowaniaFunkcjiLiczbowej.*;

import java.util.Arrays;

// To już już jest kod pisany na co dzień przez zwykłych programistów,
// który używają gotowych schematów.
public class UzycieLambd2 {

	public static void main(String[] args) {
		double[] a = {0, 10, 20, 30, 40, 50};
		double[] b = {100, 16, 25, 2};

		System.out.println("a: " + Arrays.toString(a));
		System.out.println("b: " + Arrays.toString(b));
		System.out.println();
		
		// tutaj mogę w wygodny sposób podawać funkcje
		zastosujdoTablicy(a, x -> x*x);
		zastosujdoTablicy(b, Math::sqrt);

		System.out.println("a: " + Arrays.toString(a));
		System.out.println("b: " + Arrays.toString(b));
		System.out.println();
		
	}

}
