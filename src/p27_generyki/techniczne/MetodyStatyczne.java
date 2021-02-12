package p27_generyki.techniczne;

import java.util.Optional;

import p27_generyki.v2_generics.Para;

public class MetodyStatyczne {
	// Metody mogą być parametryzowane typami generycznymi - każda niezależnie.
	// Te parametry nie mają nic wspólnego z parametreami na poziomie klasy, w której jesteśmy (gdyby takie były).
	// Można to robić zarówno dla metod statycznych (w praktyce znacznie częściej),
	// jak i dla instancyjnych.

	static <T> T ident(T arg) {
		return arg;
	}

	static <T> Optional<T> opakuj(T arg) {
		if (arg == null) {
			return Optional.empty();
		} else {
			return Optional.of(arg);
		}
	}
	
	static <T> T dajNulla() {
		return null;
	}

	static <L, R> void wypisz(Para<L,R> para) {
		System.out.println(para);
	}

	static <L, R> Para<R,L> zamien(Para<L,R> para) {
		return new Para<>(para.getPrawy(), para.getLewy());
	}

	public static void main(String[] args) {
		String s, z;
		s = "Ala";
		
		z = ident(s);
		System.out.println(z);
		
		System.out.println(opakuj(s));
		System.out.println(opakuj(null));
	}

}
