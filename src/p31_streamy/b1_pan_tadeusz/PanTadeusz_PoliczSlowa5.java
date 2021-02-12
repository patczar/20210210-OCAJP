package p31_streamy.b1_pan_tadeusz;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PanTadeusz_PoliczSlowa5 {

	public static void main(String[] args) {
		
		try {
			Map<String, Long> wyniki = Files.lines(Paths.get("pan-tadeusz.txt"), Charset.forName("utf-8"))
				.flatMap(line -> Stream.of(line.split("[^\\p{L}^\\d]+")))
				.filter(s -> !s.trim().isEmpty())
				.map(String::toLowerCase)
				.collect(Collectors.groupingBy(
						Function.identity(),
						TreeMap::new,
						Collectors.counting()))
				.entrySet().stream()
				.sorted(Entry.comparingByValue())
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue,
						(x,y) -> x, LinkedHashMap::new));
			
			wyniki.forEach((k,v) -> {
				System.out.printf("%20s -> %5d\n", k, v);
			});
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
