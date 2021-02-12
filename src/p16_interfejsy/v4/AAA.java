package p16_interfejsy.v4;

public interface AAA {
	
	String stala = "Ala ma kota"; // public static final - nawet jak nie piszemy

	default String x() {
		return "AAA";
	}
	
}
