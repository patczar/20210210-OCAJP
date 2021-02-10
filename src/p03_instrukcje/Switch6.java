package p03_instrukcje;

public class Switch6 {

	public static void main(String[] args) {
		byte bb = 100;
		// Wartości podawane w case muszą być zgodne z typem parametru switch-a.
		// W przypadku liczb oznacza to także, że liczba musi mieścić się w zakresie,
		switch(bb) {
		case 100: System.out.println("100"); break;
		//NK case 200: System.out.println("200"); break;
		}

		short ss = 100;
		switch(ss) {
		case 100: System.out.println("100"); break;
		case 200: System.out.println("200"); break;
		case 4000: System.out.println("4000"); break;
		//NK case 33000: System.out.println("100"); break;
		}

		char cc = 'A';
		switch(cc) {
		case 'A' : System.out.println("AAA"); break;
		case 120 : System.out.println("BBB"); break;
//		case 10 : System.out.println("10"); break;
		case 0xA : System.out.println("0xA"); break;
		//NK case 65 : System.out.println("CCC"); break;
		//NK case -1 : System.out.println("DDD"); break;
		case 64000: System.out.println("EEE"); break;
		//NK case 66000: System.out.println("FFF"); break;
		}
		
		/*
		long l = 27L;
		// nie ma switch na typach long, float, double
		switch(l) {
		case 27L : System.out.println("long 27");
		}
		*/
		
	}
}
