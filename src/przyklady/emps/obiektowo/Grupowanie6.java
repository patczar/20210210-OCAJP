package przyklady.emps.obiektowo;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import przyklady.emps.Employee;
import przyklady.emps.ObslugaCSV;

import java.util.TreeMap;

public class Grupowanie6 {

    public static void main(String[] args) {
    	final List<Employee> employees = ObslugaCSV.readFromFile("employees.csv");

    	final Map<String, int[]> mapa = new TreeMap<>();

        for (Employee emp : employees) {
            final String jobTitle = emp.getJobTitle();
			if(mapa.containsKey(jobTitle)) {
				int[] wpis = mapa.get(jobTitle);
				wpis[0] += 1;
				wpis[1] += emp.getSalary();
            } else {
                mapa.put(jobTitle, new int[] {1, emp.getSalary()});
            }
        }

        for(Entry<String, int[]> entry : mapa.entrySet()) {
        	String job = entry.getKey();
        	int ilosc = entry.getValue()[0];
        	int suma = entry.getValue()[1];
        	double srednia = 1.0 * suma / ilosc;
            System.out.printf("%-32s | %2d | %8.2f%n", job, ilosc, srednia);
		}
    }
}
