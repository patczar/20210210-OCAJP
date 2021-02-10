package p02_zmienne;

public class Zmienne2 {

	public static void main(String[] args) {
		int x, y;
		
		x = 20;
		System.out.println(x);
		if(x > 10) {
			y = 300;
			System.out.println(y);
		}

		// kompilator widzi, ze "y może nie być zainicjowany"
		// bo "nie wie" czy program wszedł do if-a
		//NK System.out.println(y);
		
		if(x > 20) {
			y = 1000;
		} else {
			y = 2000;
		}
		
		System.out.println(y);
	}

}
