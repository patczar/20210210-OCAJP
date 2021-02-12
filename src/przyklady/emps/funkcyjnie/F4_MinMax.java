package przyklady.emps.funkcyjnie;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import przyklady.emps.Employee;
import przyklady.emps.ObslugaCSV;

public class F4_MinMax {

	public static void main(String[] args) {
		List<Employee> employees = ObslugaCSV.readFromFile("employees.csv");
		
		Optional<Employee> najbiednieszy = employees.stream()
			.min(Comparator.comparing(Employee::getSalary));
		
		Optional<Employee> najbogatszy = employees.stream()
				.max(Comparator.comparing(Employee::getSalary));
			
		
		if(najbiednieszy.isPresent()) {
			System.out.println("Najbiednieszy: " + najbiednieszy.get());
		}
		
		String txt = najbogatszy.map(emp ->
				"nazywa się " + emp.getFirstName() + " " +emp.getLastName()
				+ " i zarabia " + emp.getSalary())
			.orElse("nie istnieje");
		
		System.out.println("Najbogatszy " + txt);
	}

}
