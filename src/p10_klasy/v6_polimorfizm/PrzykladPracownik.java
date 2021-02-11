package p10_klasy.v6_polimorfizm;

import java.math.BigDecimal;

public class PrzykladPracownik {

	public static void main(String[] args) {
		Pracownik adam = new Pracownik("Adam", "Nowak", 35, "kierowca", new BigDecimal("3210.50"));
		System.out.println(adam);
		System.out.println(adam.pensja);
		
		Pracownik barbara = new Pracownik("Barbara", "Bababab", 40, "księgowa", 4500);
		System.out.println(barbara);
		System.out.println(barbara.pensja);

	}

}
