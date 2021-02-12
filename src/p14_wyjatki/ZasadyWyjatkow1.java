package p14_wyjatki;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ZasadyWyjatkow1 {

	public static void main(String[] args) {
		
//		 try {
//			 System.out.println("Ala ma kota");
//			 File f = new File("plik.txt");
//			 // tu na pewno nie ma IOException
//		  
//		 } catch (IOException e) {
//			 // nie kompiluje się - ale to dotyczy tylko wyjątków "checked"
//			 System.out.println("wyjątek którego nie ma prawa być");
//		 }
		
		try {
			
		} catch(NullPointerException e) {
			// RuntimeExceptiony można zawsze próbować łapać
			System.out.println("NPE którego nie było");
		}
		
		try {
			
		} catch(Exception e) {
			// exception i Throwable można łapać zawsze, bo one obejmują w sobie RuntimeException i Error
		}
		
		try {
			Scanner sc = new Scanner(new File("ala.txt"));
			// konstruktor Scanner() deklaruje FileNotFoundException
			// można łapać IOException, bo to jest nadklasa
			
			sc.close();
		} catch(IOException e) {
			System.out.println("IOEx");
		}

		// przykład "try-with-resources"
		try(Scanner sc = new Scanner(new File("ala.txt"))) {
			
			String linia = sc.nextLine();
			System.out.println(linia);

			// nie trzeba pisać close, a Java i tak zamknie plik
		} catch(IOException e) {
			System.out.println("IOEx");
		}
	}
}
