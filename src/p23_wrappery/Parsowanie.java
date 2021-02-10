package p23_wrappery;

public class Parsowanie {

	public static void main(String[] args) {
		String napis = "1234";
		
		// to są prawdziwe typy operacji parseInt i valueOf
		int i = Integer.parseInt(napis);
		Integer ii = Integer.valueOf(napis);
		
		// ale można napisac odwrotnie, bo zadziała autoboxing / outboxing
		int j = Integer.valueOf(napis);
		Integer jj = Integer.parseInt(napis);
	}

}
