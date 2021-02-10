package p01_interakcja.argumenty;

/*
Gdy uruchamiamy jakiś program w systemowym wierszu poleceń,
możemy po jego nazwie podać dowolne napisy – argumenty programu.

java p01_interakcja.argumenty.Argumenty Jeden Dwa "Ala ma kota" Cztery
*/

public class Argumenty {
	public static void main(String[] args) {
		System.out.println("Liczba argumentów: " + args.length);

		// System.out.println("Argument nr 1: " + args[1]);

		for (String arg : args) {
			System.out.println(arg);
		}
	}
}
