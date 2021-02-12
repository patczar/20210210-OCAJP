package p16_interfejsy.v2;

public class Implementacja1 implements Interfejs {

	// implementacja musi zdefiniować te metody, które nie miały implementacji w interfejsie
	// a może zaimplementować (nadpisać) metody default (niekoniecznie wszystkie)
	
	public int wartosc() {
		return 1313;
	}
	
	public void nowaMetoda() {
		// będą w implementacji interfejsu można odwoływać się do stałych
		System.out.println(NAZWA);
		
		// nie można odwoływać się w ten sposób do metod statycznych
		//NK powtorz(this, 5);
	}

	
	public static void main(String[] args) {
		Implementacja1 obiekt = new Implementacja1();
		
		obiekt.wypisz(); // zadziała defaultowe wypisz z interfejsu, ale w środku wartosc 1313
		
		obiekt.nowaMetoda();
		
	}
}
