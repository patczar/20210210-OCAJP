package p16_interfejsy.v1;

import java.time.LocalTime;

public interface NieStala {
	// Tak naprawdę to nie jest stała, bo wartośc będzie ustalana od nowa przy każdym uruchomieniu programu
	public static final int SEK = LocalTime.now().getSecond();

}
