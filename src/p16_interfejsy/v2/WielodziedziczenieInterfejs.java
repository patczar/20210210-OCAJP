package p16_interfejsy.v2;

/* Interfejs może rozszerzać wiele interfejsów.
 * Jeśli istnieją domyślne implementacje, to trzeba je nadpisać.
 */

public interface WielodziedziczenieInterfejs extends Interfejs, InnyInterfejs {
	default void wypisz() {
	}
}
