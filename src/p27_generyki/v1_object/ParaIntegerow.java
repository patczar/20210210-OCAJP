package p27_generyki.v1_object;

import java.util.Objects;

/* Wersja bez typów generycznych - programowanie jak w Javie <= 1.4.
 * 
 * Istnieje możliwość tworzenia osobnych klas w zlaeżnośc iod tego, co będą miały w środku.
 * Ale to pracochłonne i redundantne.
 */
public class ParaIntegerow {
	private Integer lewy;
	private Integer prawy;
	
	public ParaIntegerow() {
	}

	public ParaIntegerow(Integer lewy, Integer prawy) {
		this.lewy = lewy;
		this.prawy = prawy;
	}
	
	public Integer getLewy() {
		return lewy;
	}

	public void setLewy(Integer lewy) {
		this.lewy = lewy;
	}

	public Integer getPrawy() {
		return prawy;
	}

	public void setPrawy(Integer prawy) {
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
		ParaIntegerow other = (ParaIntegerow) obj;
		return Objects.equals(lewy, other.lewy) && Objects.equals(prawy, other.prawy);
	}
	
}
