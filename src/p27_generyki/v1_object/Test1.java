package p27_generyki.v1_object;

import java.time.LocalDate;

public class Test1 {

	public static void main(String[] args) {
		Para para1 = new Para("Ala", 33);
		System.out.println(para1);
		
		// problem1: odczytując dostaję ogólny typ Object i muszę dokonać rzutowania:
		String imie = (String) para1.getLewy();
		int wiek = (Integer) para1.getPrawy();
		System.out.println(imie + " : " + wiek);
		
		// problem2: brak kontroli typów podczas zapisywania (przekazywania parametrów):
		para1.setPrawy(LocalDate.now());
		
		// łatwo się pomylić co do typu obiektu
		wiek = (Integer) para1.getPrawy(); // EXN
		System.out.println(wiek);
	}

}
