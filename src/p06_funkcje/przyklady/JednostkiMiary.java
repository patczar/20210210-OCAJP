package p06_funkcje.przyklady;

public class JednostkiMiary {
	
	public static double mileNaKm(double mile) {
		return 1.6 * mile;
	}
	
	public static double kmNaMile(double km) {
		return km / 1.6;
	}
	
	public static double farNaCel(double f) {
		//źle: return 5/9 * (f - 32);
		// return (f - 32) * 5 / 9;
		// return 5.0/9.0 * (f - 32.0);
		return (f - 32.0) / 1.8;
	}
	
	public static double celNaFar(double c) {
		// return 9.0/5.0 * c + 32.0;
		return 1.8 * c + 32.0;
	}

	public static void main(String[] args) {
		System.out.println("100 mil = " + mileNaKm(100) + " km");
		System.out.println("100 km = " + kmNaMile(100) + " mil");
		System.out.println("160 km = " + kmNaMile(160) + " mil");
		System.out.println();
		
		System.out.println("0 F = " + farNaCel(0) + " C");
		System.out.println("100 F = " + farNaCel(100) + " C"); // ok 37
		System.out.println("0 C = " + celNaFar(0) + " F");
		System.out.println("37 C = " + celNaFar(37) + " F"); // ok 100
		System.out.println("100 C = " + celNaFar(100) + " F"); // 212
	}

}
