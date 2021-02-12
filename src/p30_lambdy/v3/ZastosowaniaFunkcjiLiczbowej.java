package p30_lambdy.v3;

// Tego typu kod piszą twórcy "frameworków", gotowych rozwiązań
// Tutaj uzywamy nazw takich jak FunkcjaLiczbowa, oblicz
// - normalne programowanie w Javie.
// Ale robimy to, aby zwykli programiści mieli łatwiej w takich miejscahc jak Uzycie2
public class ZastosowaniaFunkcjiLiczbowej {
	
	// Ta operacja bardzo przypomina map na streamach
	// Tutaj zmienia wartość wewnątrz tablicy
	public static void zastosujdoTablicy(double[] tab, FunkcjaLiczbowa f) {
		for (int i = 0; i < tab.length; i++) {
			tab[i] = f.oblicz(tab[i]);
		}
	}
}
