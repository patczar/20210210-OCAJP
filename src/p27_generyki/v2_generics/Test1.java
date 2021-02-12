package p27_generyki.v2_generics;

public class Test1 {

	public static void main(String[] args) {
		Para<String, Integer> para1 = new Para<String, Integer>("Ala", 33);
		System.out.println(para1);
		
		// Podczas odczytywania nie trzeba rzutować.
		String imie = para1.getLewy();
		Integer wiek = para1.getPrawy();
		System.out.println(imie + " : " + wiek);
		
		// Tym razem taka próba się nie skompiluje
		// para1.setPrawy(LocalDate.now());
		
		// Poszczególne instancje mogą mieć różnie ustalone parametry generyczne.
		Para<Integer, Integer> para2 = new Para<>();
		para2.setLewy(13);
		para2.setPrawy(13);
		System.out.println(para2);
		System.out.println();
		
		// Na etapie kompilacji zmienne para1 i para2 są różnego typu
		//NK para1 = para2;
		
		// Jednak w runtime klasa tych obiektów jest taka sama.
		System.out.println(para1.getClass());
		System.out.println(para2.getClass());
		System.out.println(para1.getClass() == para2.getClass());
		
	}

}
