package p23_wrappery;

public class Wrappery2 {

	public static void main(String[] args) {
		int x = 99;
		
		Integer i1 = new Integer(7);
		Integer i2 = Integer.valueOf(8);
		
		// od Javy 5 działa "autoboxing"  za pomocą valueOf
		Integer i3 = 77;
		Integer i4 = args.length;
		Integer i5 = x;
		
		int j5 = i5; // "outboxing"
		
		long l = 3;
		//NK Long l1 = 3; // autoboxing działa tylko bezpośrednio pomiędzy odpowiednimi typami
		Long l2 = 3L;
		Long l3 = l;
		//NK Long l4 = x;
		
		long l4 = i1; // ale "outboxing" można połączyć z "widening", np. Integer skonwertować do long
		
		Number n = i4;
		Number n2 = 55; // jako Integer
		System.out.println("n2: " + n2.getClass());
		Number n3 = 55L; // jako Long
		System.out.println("n3: " + n3.getClass());
		
		Object o = 345;
		System.out.println("o: " + o.getClass());
		
		Byte bb = 127; // Byte
		Number nn = bb;
		System.out.println(nn);
		nn = 128;  // Integer
		System.out.println(nn);
		
		// To SĄ podklasy Number
		Byte bbbbbb;
		Short s;
		Integer iii;
		Long lll;
		Float f;
		Double d;
		
		// Te klasy NIE SĄ podklasami Number
		Boolean bbb = true;
		// Boolean.FALSE,  Boolean.TRUE;
		Character ccc = 'C';
	}

}
