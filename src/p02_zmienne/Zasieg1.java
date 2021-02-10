package p02_zmienne;

public class Zasieg1 {
	static int x;

	public static void main(String[] args) {
		System.out.println("A: " + x);
		x = 100;
		System.out.println("B: " + x);
		
		int x = 500;
		System.out.println("C: " + x);
		metoda();
		System.out.println("I: " + x);
		
	}
	
	static void metoda() {
		// w tym miejscu nie widać lokalnych zmiennych z innych metod (np. main)
		// a widać zmienne z poziomu klasy ("globalne")
		System.out.println("D: " + x);
		
		if(x > 0) {
			String x = "700";
			System.out.println("E: " + x);
		}
		
		System.out.println("F: " + x);
		
		{
			// wolno przesłaniać zmienne klasowe za pomocą zmiennych lokalnych
			int x = 300;
			System.out.println("G: " + x);
			if(true) {
				// nie wolno przesłaniać zmiennych lokalnych
				//NK int x = 400;	
				// System.out.println("H: " + x);
			}
		}
		
		System.out.println("K: " + x);
	}

}
