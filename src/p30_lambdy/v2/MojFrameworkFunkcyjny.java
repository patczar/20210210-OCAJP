package p30_lambdy.v2;

public class MojFrameworkFunkcyjny {
	
	public static void podmien(double[] tab, FunkcjaLiczbowa f) {
		for (int i = 0; i < tab.length; i++) {
			tab[i] = f.oblicz(tab[i]);
		}
	}

}
