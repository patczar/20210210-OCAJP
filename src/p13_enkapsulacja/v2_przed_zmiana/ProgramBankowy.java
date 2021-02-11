package p13_enkapsulacja.v2_przed_zmiana;

import java.time.LocalDate;
import java.util.Scanner;

public class ProgramBankowy {

    public static void main(String[] args) {
   	 @SuppressWarnings("resource")
   	 Scanner sc = new Scanner(System.in);

   	 Osoba ala = new Osoba("Ala", "Kowalska", LocalDate.of(1991, 3, 4));
   	 
   	 System.out.print("Podaj początkową kwotę: ");
   	 int kwota = sc.nextInt();
   	 sc.nextLine(); // wymuszenie przejścia do nowej linii
   	 
   	 Konto konto = new Konto(1, kwota, ala);
   	 
   	 System.out.println(konto);

   	 petla:
   	 while(true) {
   		 try {
   			 System.out.println("Co chcesz zrobić?  W - wpłata, Y - wypłata, K - koniec");
   			 String wybor = sc.nextLine().toUpperCase();
   			 switch(wybor) {
   				 case "K":
   					 break petla;
   				 
   				 case "W":
   					 System.out.print("Podaj kwotę wpłaty: ");
   					 kwota = sc.nextInt();
   					 sc.nextLine();
   					 konto.wplata(kwota);
   					 System.out.println("Pieniądze zostały wpłacone");
   					 break;
   				 case "Y":
   					 System.out.print("Podaj kwotę wypłaty: ");
   					 kwota = sc.nextInt();
   					 sc.nextLine();
   					 konto.wyplata(kwota);
   					 
   					 // ta linia wykona się tylko jeśli nie było wyjątku:
   					 System.out.println("Pieniądze zostały wypłacone");
   					 break;
   			 }
   		 } catch (IllegalArgumentException e) {
   			 System.out.println("Niepoprawny parametr: " + e.getMessage());
   		 } catch(Throwable e) {
   			 System.out.println("Inny błąd: " + e);
   		 }
   		 System.out.println();
   		 System.out.println(konto);
   		 System.out.println();
   	 }
   	 
    }

}



