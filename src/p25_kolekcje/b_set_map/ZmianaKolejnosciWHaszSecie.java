package p25_kolekcje.b_set_map;

import java.util.Arrays;
import java.util.HashSet;

public class ZmianaKolejnosciWHaszSecie {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		
		set.addAll(Arrays.asList("Ala", "Ola", "Ula", "Ela", "Ewa", "Ania", "Kasia", "Aga", "Iwona", "Magda", "Iza"));
		
		System.out.println(set.size());
		System.out.println(set);
		
		set.add("Julia");
		System.out.println(set.size());
		System.out.println(set);

		set.add("Ewelina");
		System.out.println(set.size());
		System.out.println(set);
		
//		for (String s : set) {
//			int hash = s.hashCode();
//			System.out.printf("%10s : hash = %10d , h%%16 = %2d , h%%32 = %2d\n",
//					s, hash, hash%16, hash%32);
//		}
		
	}

}
