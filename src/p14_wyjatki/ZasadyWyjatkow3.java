package p14_wyjatki;

public class ZasadyWyjatkow3 {

	public static void main(String[] args) {
	
		try {
			System.out.println();
		} catch(ArithmeticException | NullPointerException | NumberFormatException e) {
			// zmienna e jest typu, który jest najbliższą wspólną nadklasą wszystkich klas wymienionych w catch
			RuntimeException e2 = e;
			
			System.out.println("multicatch złapał " + e.getMessage());
		}

// pewniak na egzaminie: multi-catch, w którym coś się nie zgadza
//		try {
//			System.out.println();
//		} catch(NumberFormatException | IllegalArgumentException e) {
//			// nie kompiluje sie bo NumberFormatException jest podklasą IllegalArgumentException
//			System.out.println("multicatch złapał " + e.getMessage());
//		}
//
//		try {
//			System.out.println();
//		} catch(Exception | NullPointerException e) {
//			// nie można wymieniać tych klas, które są spokrewnione "w linii prostej"
//			System.out.println("multicatch złapał " + e.getMessage());
//		}

	}
}
