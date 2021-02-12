package p13_enkapsulacja.v1_brak_enkapsulacji;

import java.util.stream.DoubleStream;

public class Program {

	public static void main(String[] args) {
		// Gdy klasy nie stosują zasad enkapsulacji, to programy mogą bezpośrednio używać zmiennych z tych klas:
		
		Student student = new Student("Ada", "Nowak", 22, "biologia", 2);
		
		System.out.println(student.imie);
		student.imie = "Adam";
		
		student.dodajOcene(3.5);
		student.dodajOcene(4.5);
		
		// Programy mogą zakładać, że zmienna oceny jest typu tablica
		// wtedy po ewnetualnej zmianie na listę - programy rpzestaną się kompilować
		double[] oceny = student.oceny;
		
		// Nie zawsze ten dostęp jest celowym "psuciem", czasami inny programista korzysta z naszej zmiennej z dobrymi intencjami.
		// Ten kod nie robi nic złego, ale kompiluje się tylko przy założeniu, że student.oceny jest tablicą double[]
		System.out.println("średnia wyliczona streamem: " + DoubleStream.of(student.oceny).sum() / student.iloscOcen);


		// Są też jednak zagrożenia...
		// Dostęp do tablicy jest też groźny, bo program może modyfikować zawartość
		for (int i = 0; i < oceny.length; i++) {
			oceny[i] += 1;
		}
		

		Konto konto = new Konto(1, 1000, student);
		// można w szczególności wpisać "bez żadnego uzasadnienia" saldo w koncie
		konto.saldo = 5000;
		
		konto.saldo += 10000;
		
		// możemy doprowadzić do ujemnego saldo - nie ma żadnej kontroli
		konto.saldo -= 40000;
		
		System.out.println(konto);
		
		
	}

}
