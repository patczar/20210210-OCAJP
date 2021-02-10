package p02_zmienne;

public class Inicjalizacja {
	// zmienne statyczne - inicjowane domyślnie na 0, false lub null
	static int st;
	
	// zmienne instancyjne - inicjowane domyślnie na 0, false lub null
	int inst;

	public static void main(String[] args) {
		// zmienne lokalne - nie są automatyczne inicjowane
		int lokalna;
		
		System.out.println(st); // 0
		//NK System.out.println(inst);

		Inicjalizacja obiekt = new Inicjalizacja();
		System.out.println(obiekt.inst); // 0

		// błąd kompilacji - aby odczytać zmienną lokalną, musi zostać wcześniej zainicjalizowana (w taki sposób, żeby kompilator miał pewność)
		//NK System.out.println(lokalna);
		
		if(st >= 0) {
			lokalna = 13;
			System.out.println(lokalna); // OK
		}
		//NK System.out.println(lokalna);

		if(st >= 0) {
			lokalna = 10;
		} else {
			lokalna = 20;			
		}
		System.out.println(lokalna); // OK
	}

}
