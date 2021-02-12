package p30_lambdy.v3;

public class Test1 {

	public static void main(String[] args) {
		FunkcjaLiczbowa f1 = new DoKwadratu();
		System.out.println(f1.oblicz(5.0));

		FunkcjaLiczbowa f2 = new FunkcjaLiczbowa() {
			public double oblicz(double x) {
				return x*x;
			}
		};
		System.out.println(f2.oblicz(5.0));

		FunkcjaLiczbowa f3 = y -> y*y;
		System.out.println(f3.oblicz(5.0));
		
		FunkcjaLiczbowa f4 = Math::sqrt;
		System.out.println(f4.oblicz(25.0));
				
	}

}
