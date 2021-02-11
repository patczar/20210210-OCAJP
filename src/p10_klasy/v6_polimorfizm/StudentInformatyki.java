package p10_klasy.v6_polimorfizm;

public class StudentInformatyki extends Student {

	public StudentInformatyki() {
		super();
	}

	public StudentInformatyki(String imie, String nazwisko, int wiek, int rok) {
		super(imie, nazwisko, wiek, rok, "informatyka");
	}

}
