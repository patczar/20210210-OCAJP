package p14_wyjatki;

import java.io.FileInputStream;
import java.io.IOException;

public class KiedyTrzebaLapac {

	public static void main(String[] args) {
		String s = "123";
		
		// tutaj może dojść do błędu NumberFormatException
		// nie ma błędu kompilacji - ten wyjątek należy do kategorii "unchecked"
		int x = Integer.parseInt(s);
		System.out.println(x);
		
		// operacje dotyczące plików mogą kończyć się wyjątkiem IOException
		// tym razem musimy te wyjątki jawnie obsłużyć - za pomocą try-catch albo throws
		// bo IOException jest wyjątkiem z kategorii "checked"
		try {
			FileInputStream in = new FileInputStream("plik.txt");
			int bajt;
			while((bajt = in.read()) != -1) {
				System.out.println("kolejny bajt: " + bajt);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
