package p17_enum;

import static p17_enum.DzienTygodnia1.*;

import java.util.Arrays;

public class Test1_import_static {
	
	static String tekst(DzienTygodnia1 dt) {
		// można użyć switch, nie wolno prefiksować wartości nazwą klasy
		switch (dt) {
		case PON: return "poniedziałek";
		case WTO: return "wtorek";
		case SRO: return "środa";
		case CZW: return "czwartek";
		case PIA: return "piątek";
		case SOB: return "sobota";
		case NIE: return "niedziela";
		// ale mimo wyczerpania wszystkich wartości potrzebny default
		default : return "???";
		}
	}

	public static void main(String[] args) {
		// dzięki static import mogę używać krótkich nazw z enuma także poza switch
		DzienTygodnia1 dt = WTO;
		
		DzienTygodnia1 wczytany = DzienTygodnia1.valueOf("WTO");
		
		//EXN DzienTygodnia1a wczytany = DzienTygodnia1.valueOf("nie ma takiego dnia");
		// IllegalArgumentException
		
		if(dt == wczytany) {
			System.out.println("równe");
		} else {
			System.out.println("nierówne");
		}
		
		if(dt.equals(wczytany)) {
			System.out.println("równe");
		} else {
			System.out.println("nierówne");
		}
		// == równoważne equals; dla każdej wartości enuma istnieje dokładnie jeden obiekt
		
		
		System.out.println();

		// Standardowo dostępne informacje dla pojedynczej wartości:
		System.out.println(dt);
		System.out.println(dt.toString());
		System.out.println(dt.name());
		System.out.println(dt.ordinal());  // od 0
		//NK System.out.println(dt < wczytany);
		System.out.println(dt.compareTo(wczytany));  // OK
		
		System.out.println(tekst(dt));
		
		System.out.println();
		// Standardowo dostępne rzeczy dla klasy enuma:
		DzienTygodnia1 dt4 = DzienTygodnia1.valueOf("PIA");
		System.out.println(dt4);
		DzienTygodnia1[] values = DzienTygodnia1.values();
		System.out.println(Arrays.toString(values));
		System.out.println(DzienTygodnia1.class.getSuperclass());
	}

}
