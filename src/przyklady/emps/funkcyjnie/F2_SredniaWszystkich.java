package przyklady.emps.funkcyjnie;

import java.util.List;

import przyklady.emps.Employee;
import przyklady.emps.ObslugaCSV;

public class F2_SredniaWszystkich {

	public static void main(String[] args) {
		List<Employee> employees = ObslugaCSV.readFromFile("employees.csv");
		
		double srednia = employees.stream()
			.mapToInt(Employee::getSalary)
			.average()
			.getAsDouble();
		
		System.out.println("Średnia: " + srednia);
		
	}

}
