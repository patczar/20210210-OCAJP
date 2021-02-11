package p10_klasy.v6_polimorfizm;

public class Przyklad1 {

	public static void main(String[] args) {
		// Dzięki temu, że istnieje klasa Osoba, możemy
		// 1) zadeklarować zmienną typu Osoba
		Osoba a;
		
		// w tym momencie zmienna jest niezainicjowana, i nie można jej odczytać
		//NK System.out.println(a);
		//NK System.out.println(a.getClass());
		
		// 2) utworzyć obiekt klasy Osoba
		a = new Osoba();
		
		// teraz (upraszczając) w zmiennej a mamy obiekt
		System.out.println(a);
		System.out.println(a.getClass());
		
		// Najczęściej deklarację zmiennej i tworzenie obiektu zapisuje się w jednej linii
		Osoba b = new Osoba();
		System.out.println(b);
		System.out.println();		
		
		// Każdy obiekt w Javie (nawet pustej klasy) posiada pewien zestaw metod.
		System.out.println(a.toString() + ", " + b.toString());		
		System.out.println(a.getClass() + ", " + b.getClass());
		
		// equals i hashCode służą do porównywania obiektów
		// domyslnie sprawdzają czy to ten sam obiekt (w sensie miejsca w pamięci)
		// ale twórcy klas mogą zmienić działanie tych metod w swoich klasach
		
		System.out.println(a.equals(a)); // true
		System.out.println(a.equals(b)); // false

		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		// są jeszcze metody związane z wielwątkowością
		// ale tutaj one nie mają szansy zadziałać
//		a.wait();
//		a.notify();
//		a.notifyAll();
	}

}
