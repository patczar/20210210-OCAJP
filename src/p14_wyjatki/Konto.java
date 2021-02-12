package p14_wyjatki;

class BrakSrodkow extends Exception {

}

class Konto {
	public void wyplata(int kasa) throws BrakSrodkow {
		// usunięcie throws spowoduje błąd kompilacji w uzytkowniku
	}
}

class Uzytkownik {
	public static void main(String[] args) {
		Konto k = new Konto();
		
		try {
			k.wyplata(400);
			System.out.println("jest kasa");
			
		} catch (BrakSrodkow e) {
			System.out.println("nie ma kasy");
		}
	}
}

