package p31_streamy.b1_pan_tadeusz;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class PanTadeusz_WypiszSlowa {

	public static void main(String[] args) {

		String str = "Ala Ola, Ela,; - 123 Ala3 eno";
		//String[] slowa = str.split("\\s+");
		String[] slowa = str.split("[^\\p{L}\\d]+");
		System.out.println(Arrays.toString(slowa));
		
		try {
			Files.lines(Paths.get("pan-tadeusz.txt"), Charset.forName("utf-8"))
				.flatMap(line -> Stream.of(line.split("[^\\p{L}^\\d]+")))
				.forEach(System.out::println);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
