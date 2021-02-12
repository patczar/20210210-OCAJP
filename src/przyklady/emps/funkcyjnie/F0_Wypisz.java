package przyklady.emps.funkcyjnie;

import java.util.List;

import przyklady.emps.Employee;
import przyklady.emps.ObslugaCSV;

public class F0_Wypisz {

	public static void main(String[] args) {
		List<Employee> employees = ObslugaCSV.readFromFile("employees.csv");
		employees.forEach(System.out::println);
	}

}
