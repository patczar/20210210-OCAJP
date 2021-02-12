package p16_interfejsy.v1;

/* Tradycyjne spojrzenie na to czym jest interfejs:
   * lista metod "do zaimplementowania"
   * zawiera sygnatury metod, bez ich implementacji
   * pełni rolę "kontraktu", z którym mogą być zgodne niektóre klasy
   * 
   * od Javy 8: interfejs może zawierać implementacje niektórych metod, oraz metody statyczne
 */

public interface Interfejs {
	// Interfejsy mogą zawierać:
	// 1) metody
	// Do każdej metody niejawnie dopisywane są modyfikatory:
	// public abstract
	// Z tego wynika, że w klasach, które implementują interfejsy, te metody muszą być public
	void wypisz();
	
	public double oblicz(double arg1, double arg2);
	
	public abstract void p();
	
	//NK protected void m();
	//NK private void m();
	//NK final void n();
	
	
	// 2) zmienne
	int x = 5;
	// do każdej rzeczy wyglądającej jak zmienna dopisywane są:
	// public static final
	// W praktyce używa się do zapisywania stałych
	
	public static final String NAZWA = "ALX";
	
	// trzeba podać wartość
	//NK double y;
	
	/* W interfejsach NIE MA statycznych bloków inicjalizacyjnych:
	static {
		y = 44;
	}
	*/

}
