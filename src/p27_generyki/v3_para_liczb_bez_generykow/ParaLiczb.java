package p27_generyki.v3_para_liczb_bez_generykow;

import java.util.Objects;

public class ParaLiczb {
	private Number lewy;
	private Number prawy;
	
	public ParaLiczb() {
	}

	public ParaLiczb(Number lewy, Number prawy) {
		this.lewy = lewy;
		this.prawy = prawy;
	}
	
	public Number getLewy() {
		return lewy;
	}

	public void setLewy(Number lewy) {
		this.lewy = lewy;
	}

	public Number getPrawy() {
		return prawy;
	}

	public void setPrawy(Number prawy) {
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
