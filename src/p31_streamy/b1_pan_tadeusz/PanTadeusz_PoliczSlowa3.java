package p31_streamy.b1_pan_tadeusz;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.Collator;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PanTadeusz_PoliczSlowa3 {
	
	static <T> T identycznosc(T x) {
		return x;
	}

	public static void main(String[] args) {
		
		try {
			Map<String, Long> wyniki = Files.lines(Paths.get("pan-tadeusz.txt"), Charset.forName("utf-8"))
				.flatMap(line -> Stream.of(line.split("[^\\p{L}^\\d]+")))
				.filter(s -> !s.trim().isEmpty())
				.collect(Collectors.groupingBy(
						PanTadeusz_PoliczSlowa3::identycznosc,
						() -> new TreeMap<>(Collator.getInstance()),
						Collectors.counting()));
		
			wyniki.forEach((k,v) -> {
				System.out.printf("%20s -> %5d\n", k, v);
			});
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
