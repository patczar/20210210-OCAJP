package przyklady.emps.funkcyjnie;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import przyklady.emps.Employee;
import przyklady.emps.ObslugaCSV;

public class Grupowanie_Kolektor_2 {
	
	public static void main(String[] args) {
		List<Employee> lista = ObslugaCSV.readFromFile("employees.csv");

		// Jeśli do groupingBy przekażemy drugi parametr - kolektor,
		// to mówimy w jaki sposób "zagregować" poszczególne grupy.
		// Np. tutaj: oblicz średnią z intów (salary).
		
		Map<String, Double> srednie = lista.stream().collect(
				Collectors.groupingBy(Employee::getJobTitle,
					Collectors.averagingInt(Employee::getSalary)));
		
		srednie.forEach((job, avg) -> {
			System.out.printf("%32s :%10.2f\n", job, avg);
			
		});
	}

}
