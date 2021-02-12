package p27_generyki.techniczne;

public class GdzieMoznaUzywacGenerykow {
	
	private static class Box<T> {
		// Parametru generycznego można używać:
		// typ zmiennej instanyjnej
		
		T x, y;
		
		// typ paraterów i wyniku metod instancyjnych:
		T metoda(T parametr, String innyParametr) {
			// typ zmiennej lokalnej wewnątrz metody instancyjnej:
			
			T zmienna = parametr;
			if(zmienna == null) {
				zmienna = x;
			}
			
			return zmienna;
		}
		
		
		// Parametru generycznego nie można używać:
		// w kontekście statycznym
		// static T statyczna;
		
		// static T metodaStatyczna(T arg) {
		// 	return arg;
		// }
		
		static void normalnaMetodaStatyczna() {
			// T zmienna = null;
		}
		
		void test(T arg1, Object arg2) {
			
			// Parametru generycznego nie można używać również w poleceniach,
			// które wymagałyby znajomości tego typu w runtajmie:
			
			// System.out.println(T.class);
			
			System.out.println(x.getClass());
			
//			if(arg1 instanceof T) {
//				
//			}
//
//			if(arg2 instanceof T) {
//				
//			}

			// rzutowanie można zapisać, ale nie ma jak sprawdzić w instaceof czy to bezpieczne
			T t = (T)arg2;
			System.out.println(t);
		}
		
	}

}
