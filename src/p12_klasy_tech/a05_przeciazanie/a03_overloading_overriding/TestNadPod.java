package p12_klasy_tech.a05_przeciazanie.a03_overloading_overriding;

public class TestNadPod {

	public static void main(String[] args) {
		Integer ii = 7;
		Byte bb = 5;
		Number n = ii;
		
		Podklasa pod = new Podklasa();
		pod.print(ii);
		pod.print(bb);
		pod.print(n);
		System.out.println();
		
		Nadklasa nad = pod;
		nad.print(ii);
		nad.print(bb);
		nad.print(n);
	}
}
