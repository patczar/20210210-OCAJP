package przyklady.emps.obiektowo;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import przyklady.emps.Employee;
import przyklady.emps.ObslugaCSV;

public class Grupowanie2 {

    public static void main(String[] args) {
    	final List<Employee> employees = ObslugaCSV.readFromFile("employees.csv");

    	final Map<String, Integer> ilosci = new TreeMap<>();
    	final Map<String, Integer> sumy = new TreeMap<>();

        for (Employee emp : employees) {
            final String jobTitle = emp.getJobTitle();
			if(ilosci.containsKey(jobTitle)) {
                // to jest kolejny pracownik z tego stanowiska
                int dotychczasowaIlosc = ilosci.get(jobTitle);
                int dotychczasowaSuma = sumy.get(jobTitle);
                ilosci.put(jobTitle, dotychczasowaIlosc+1);
                sumy.put(jobTitle, dotychczasowaSuma+emp.getSalary());
            } else {
                // to jest pierwszy taki pracownik
                ilosci.put(jobTitle, 1);
                sumy.put(jobTitle, emp.getSalary());
            }
        }
        // System.out.println(sumy);

        for (String job : ilosci.keySet()) {
            double suma = sumy.get(job);
            int ilosc = ilosci.get(job);
            double srednia = suma / ilosc;
            System.out.printf("%-32s | %2d | %8.2f%n", job, ilosc, srednia);
        }
    }
}
