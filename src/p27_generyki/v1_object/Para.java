package p27_generyki.v1_object;

import java.util.Objects;

/* Wersja bez typów generycznych - programowanie jak w Javie <= 1.4 */
public class Para {
	private Object lewy;
	private Object prawy;
	
	public Para() {
	}

	public Para(Object lewy, Object prawy) {
		this.lewy = lewy;
		this.prawy = prawy;
	}

	public Object getLewy() {
		return lewy;
	}

	public void setLewy(Object lewy) {
		this.lewy = lewy;
	}

	public Object getPrawy() {
		return prawy;
	}

	public void setPrawy(Object prawy) {
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
