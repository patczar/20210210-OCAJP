package p10_klasy.v5_dziedziczenie;

public class StudentInformatyki extends Student {

	public StudentInformatyki() {
		super();
	}

	public StudentInformatyki(String imie, String nazwisko, int wiek, int rok) {
		super(imie, nazwisko, wiek, rok, "informatyka");
	}

}
