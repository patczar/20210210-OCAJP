package p17_enum;

public class Test2 {

	public static void main(String[] args) {
		DzienTygodnia2 dt = DzienTygodnia2.WTO;
		
		// mogę odwoływać się do zmiennych nie-prywatnych z obiektu enum, nawet je modyfikować
		System.out.println(dt.dlugoscTekstu);
		
		dt.dlugoscTekstu += 100;
		System.out.println(dt.dlugoscTekstu);
		System.out.println(DzienTygodnia2.WTO.dlugoscTekstu);

		dt.wypiszSie();
	}

}
