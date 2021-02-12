package p17_enum;

public enum DzienTygodnia3 {
	// Wartości mogą być tworzone poprzez wywołanie odpowiedniego konstruktora:
	PON("poniedziałek"),
	WTO("wtorek"),
	SRO("środa"),
	CZW("czwartek"),
	PIA("piątek"),
	SOB("sobota"),
	
	// Możliwość nadpisania metody dla wybranych wartości (technicznie: powstaje podklasa)
	NIE("niedziela") {
		@Override
		public boolean handelDozwolony() {
			return false;
		}
		
		public void nowaMetoda() { }
	};

	// Enum, jak zwykła klasa, może zawierać:
	// * pola
	private String nazwa;
	
	// * Konstruktory (mogą być prywatne, bo sa używane tylko wewnątrz "klasy"!)
	private DzienTygodnia3(String jakaNazwa) {
		nazwa = jakaNazwa;
	}
	
	// * Metody
	@Override
	public String toString() {
		return nazwa;
	}
	
	public boolean handelDozwolony() {
		return true;
	}
}
