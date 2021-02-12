package przyklady.emps.funkcyjnie;

import java.util.List;

import przyklady.emps.Employee;
import przyklady.emps.ObslugaCSV;

// Wylicz średnią tylko programistów (albo z pytaniem "kogo szukać")
public class F3_SredniaProgrammer {

	public static void main(String[] args) {
		List<Employee> employees = ObslugaCSV.readFromFile("employees.csv");
		
		double srednia = employees.stream()
			.filter(emp -> "Programmer".equals(emp.getJobTitle()))
			.mapToInt(Employee::getSalary)
			.average()
			.getAsDouble();
		
		System.out.println("Średnia: " + srednia);
		
	}

}
