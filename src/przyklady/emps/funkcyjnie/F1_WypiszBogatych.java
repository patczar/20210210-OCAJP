package przyklady.emps.funkcyjnie;

import java.util.List;

import przyklady.emps.Employee;
import przyklady.emps.ObslugaCSV;

public class F1_WypiszBogatych {

	public static void main(String[] args) {
		List<Employee> employees = ObslugaCSV.readFromFile("employees.csv");
		
		employees.stream()
			.filter(emp -> emp.getSalary() >= 10000)
			.forEach(emp -> System.out.println(emp.getFirstName() + " " +emp.getLastName() + " " + emp.getSalary()));
	}

}
