package przyklady.emps.funkcyjnie;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import przyklady.emps.Employee;
import przyklady.emps.ObslugaCSV;

public class Grupowanie_Kolektor_3 {
	
	public static void main(String[] args) {
		List<Employee> lista = ObslugaCSV.readFromFile("employees.csv");

		// Dodatkowy parametr podawany pośrodku ("mapFactory")
		// pozwala nam wybrać implementację słowników - tutaj tworzymy TreeMap.

		// Tutaj zamiast averagingInt zrobimy summarizingInt - to wylicza 5 funkcji agregujących na raz
		
		Map<String, IntSummaryStatistics> srednie = lista.stream().collect(
				Collectors.groupingBy(Employee::getJobTitle,
					TreeMap::new,
					Collectors.summarizingInt(Employee::getSalary)));
		
		srednie.forEach((job, statistics) -> {
			System.out.printf("%32s : %s\n", job, statistics);
		});
	}

}
