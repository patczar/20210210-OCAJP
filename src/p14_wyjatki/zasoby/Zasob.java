package p14_wyjatki.zasoby;

// java.lang.AutoClosable - od Javy 7 - klasa implementować ten interfejs, aby działała w try()
// java.io.Closeable - od Javy 5 - używany w klasach związanych z IO
// w Javie 7 dopisano, że java.io.Closeable extends java.lang.AutoClosable

public class Zasob implements AutoCloseable {
	boolean wyjatekWClose = false;
	
	public Zasob() {
		System.out.println("Zasob()");
	}

	public Zasob(boolean wyjatekNaKoniec) {
		this.wyjatekWClose = wyjatekNaKoniec;
		System.out.println("Zasob("+wyjatekNaKoniec+")");
	}

	
	@Override
	public void close() {
		System.out.println("close()");
		if(wyjatekWClose) {
			throw new IllegalStateException("wyjątek z close()");
		}
	}

	public void dzialaj() {
		System.out.println("dzialaj()");
	}

	public void przerwij() {
		System.out.println("zaraz wyrzucę wyjątek");
		throw new RuntimeException("przerwanie");
	}

}
