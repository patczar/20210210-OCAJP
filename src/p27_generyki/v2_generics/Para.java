package p27_generyki.v2_generics;

import java.util.Objects;

/*
 * Zazwyczaj nazwy parametrów typowych są jednoliterowe (T, R, ...),
 * ale z punktu widzenia składni Javy są to po prostu identyfikatory. 
 */
public class Para<Lewy, Prawy> {
	private Lewy lewy;
	private Prawy prawy;
	
	public Para() {
	}

	public Para(Lewy lewy, Prawy prawy) {
		this.lewy = lewy;
		this.prawy = prawy;
	}

	public Lewy getLewy() {
		return lewy;
	}

	public void setLewy(Lewy lewy) {
		this.lewy = lewy;
	}

	public Prawy getPrawy() {
		return prawy;
	}

	public void setPrawy(Prawy prawy) {
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
		Para other = (Para) obj;
		return Objects.equals(lewy, other.lewy) && Objects.equals(prawy, other.prawy);
	}
	
}
