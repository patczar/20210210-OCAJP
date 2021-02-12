package p17_enum;

public enum DzienTygodnia2 implements AutoCloseable {
	// Wartości mogą być tworzone poprzez wywołanie odpowiedniego konstruktora:
	DODATKOWY(13L),
	PON("poniedziałek"),
	WTO("wtorek"),
	SRO("środa"),
	CZW("czwartek"),
	PIA("piątek"),
	SOB("sobota"),
	NIE("niedziela");

	// Enum, jak zwykła klasa, może zawierać:
	// * pola
	private String nazwa;
	
	public int dlugoscTekstu;
	
	// * Konstruktory (są prywatne, bo są używane tylko wewnątrz "klasy"!)
	// można napisać poziom widoczności private, ale nawet jak nie napiszemy, to i tak będzie private
	// nie wolno podać innego poziomu widoczności
	DzienTygodnia2(String jakaNazwa) {
		nazwa = jakaNazwa;
		dlugoscTekstu = jakaNazwa.length();
	}
	
	private DzienTygodnia2(Number numer) {
	}
	
	//NK public DzienTygodnia2(int numer) { }
	
	// * Metody (i mogą implementować interfejsy)

	public void wypiszSie() {
		System.out.println("Jestem sobie " + this.nazwa + " i mam kod " + this.name() + " oraz numer " + this.ordinal());
	}

	public void close() {
		System.out.println("się zamykam...");
	}

	@Override
	public String toString() {
		return nazwa;
	}

	// Można też definiować zmienne i metody statyczne
	static String napisStatyczny = "Ala ma kota";

	static void metodaStatyczna() {
		System.out.println(napisStatyczny);
	}

}
