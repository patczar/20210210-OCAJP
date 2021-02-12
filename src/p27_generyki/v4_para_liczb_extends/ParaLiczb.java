package p27_generyki.v4_para_liczb_extends;

import java.util.Objects;

// Za pomocą ograniczeń "extends" oraz "super" możemy wymusić, że parametr typowy
// spełnia pewne warunki.
// W tym przypadku T extends Number oznacza, że T to może byc Number, Integer, Double itd., ale nie String, Object czy inne typy
public class ParaLiczb<T extends Number> {
	private T lewy;
	private T prawy;
	
	public ParaLiczb() {
	}

	public ParaLiczb(T lewy, T prawy) {
		this.lewy = lewy;
		this.prawy = prawy;
	}
	
	public T getLewy() {
		return lewy;
	}

	public void setLewy(T lewy) {
		this.lewy = lewy;
	}

	public T getPrawy() {
		return prawy;
	}

	public void setPrawy(T prawy) {
		this.prawy = prawy;
	}

	@Override
	public String toString() {
		return "<" + lewy + ", " + prawy + ">";
	}

	@Override
	public int hashCode() {
		return Objects.hash(lewy, prawy);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ParaLiczb other = (ParaLiczb) obj;
		return Objects.equals(lewy, other.lewy) && Objects.equals(prawy, other.prawy);
	}
	
	// Wiedza, że elementy są jakimiś liczbami daje mi możliwości definiowania operacji matematycznych,
	// przykładowo średnia.
	// Nie byłoby to możliwe w klasie takiej jak Para
	public double getSrednia() {
		return (lewy.doubleValue() + prawy.doubleValue()) / 2.0;
	}
	
}
