package p27_generyki.v4_para_liczb_extends;

import java.math.BigDecimal;

public class Test2 {

	public static void main(String[] args) {
		ParaLiczb<Integer> para1 = new ParaLiczb<>(new Integer(13), new Integer(3000));
		System.out.println(para1);
		
		Number lewy = para1.getLewy();
		Integer lewyi = para1.getLewy();
		
		//NK para1.setLewy(new Double(3.14));
		
		para1.setLewy(new Integer(44));
		
		// Wiedząc, że jest to para liczb, mogę korzystać z operacji matematycznych
		double avg = para1.getSrednia();
		System.out.println(avg);
		
		
		ParaLiczb<BigDecimal> para2 = new ParaLiczb<>(BigDecimal.ONE, new BigDecimal("3.99"));
		System.out.println(para2);
		avg = para2.getSrednia();
		System.out.println(avg);
		
		// Wymagane jest, aby typ był Number albo jego podklasą
		//NK ParaLiczb<String> para3 = new ParaLiczb<>();
		
	}

}
