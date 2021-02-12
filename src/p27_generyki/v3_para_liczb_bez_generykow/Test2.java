package p27_generyki.v3_para_liczb_bez_generykow;

public class Test2 {

	public static void main(String[] args) {
		ParaLiczb para1 = new ParaLiczb(new Integer(13), new Integer(3000));
		
		// Przy takim podejściu mogę odczytywane wartości potraktować jak Number:
		
		Number lewy = para1.getLewy();
		
		// Ale nie mogę założyć że to będzie np. Integer
		
		// Integer lewyi = para1.getLewy();
		Integer lewyi = (Integer) para1.getLewy();
		
		System.out.println(para1.getSrednia());

		// Mogę też wstawić dowolny Number, kompilator nie sprawdzi czy to Integer
		// A jeśli chciałbym, aby w tej konkretnej parze były Integery?
		para1.setLewy(new Double(3.14));
		
		System.out.println(para1.getSrednia());
		
		// Jednocześnie uzywanie ogólnej Pary nie daje mi wiedzy o tym, że tam są na pewno liczby
		
		Para<Integer, Integer> para = new Para<>(3,4);
		System.out.println(para);
		
		// System.out.println(para.getSrednia());
		
	}

}
