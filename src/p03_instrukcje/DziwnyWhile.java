package p03_instrukcje;

public class DziwnyWhile {

	public static void main(String[] args) {
		
		int x = 1;
		{
			System.out.println("Ala ma kota " + x);
			x++;
		} while(x <= 10);
		// To jest zwykły blok a potem pętla nieskończona
		
		System.out.println("Koniec");
	}

}
