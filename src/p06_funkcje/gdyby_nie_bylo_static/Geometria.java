package p06_funkcje.gdyby_nie_bylo_static;

public class Geometria {
	
	public double poleKwadratu(double a) {
		return a*a;
	}
	
	public double obwodKwadratu(double a) {
		return 4*a;
	}
	
	public double poleProstokata(double a, double b) {
		return a*b;
	}
	
	public double obwodProstokata(double a, double b) {
		return 2*a + 2*b;
	}
	
	public double poleKola(double r) {
		return Math.PI * r * r;
	}
	
	public double obwodKola(double r) {
		return 2 * Math.PI * r;
	}

}
