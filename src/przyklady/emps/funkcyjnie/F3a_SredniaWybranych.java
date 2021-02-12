package przyklady.emps.funkcyjnie;

import java.util.List;
import java.util.Objects;

import javax.swing.JOptionPane;

import przyklady.emps.Employee;
import przyklady.emps.ObslugaCSV;

// Wylicz średnią tylko programistów (albo z pytaniem "kogo szukać")
public class F3a_SredniaWybranych {

	public static void main(String[] args) {
		String job = JOptionPane.showInputDialog("Podaj nazwę stanowiska:");
		
		List<Employee> employees = ObslugaCSV.readFromFile("employees.csv");
		
		double srednia = employees.stream()
			.filter(emp -> Objects.equals(job, emp.getJobTitle()))
			.mapToInt(Employee::getSalary)
			.average()
			.getAsDouble();
		
		System.out.println("Średnia: " + srednia);
		
	}

}
