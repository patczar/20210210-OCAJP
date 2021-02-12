package przyklady.emps.obiektowo;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import przyklady.emps.Employee;
import przyklady.emps.ObslugaCSV;

public class Grupowanie4 {
    // W tej wersji zamiast pisać if-y użyjemy putIfAbsent / computeIfPresent (Java 8)

    public static void main(String[] args) {
        List<Employee> employees = ObslugaCSV.readFromFile("employees.csv");

        Map<String, Integer> ilosci = new TreeMap<>();
        Map<String, Integer> sumy = new TreeMap<>();

        for (Employee emp : employees) {
            String jobTitle = emp.getJobTitle();
            ilosci.putIfAbsent(jobTitle, 0);
            sumy.putIfAbsent(jobTitle, 0);
			
			ilosci.computeIfPresent(jobTitle, (k,v) -> v+1);
			sumy.computeIfPresent(jobTitle, (k,v) -> v+emp.getSalary());
        }

        for (String job : ilosci.keySet()) {
            double suma = sumy.get(job);
            int ilosc = ilosci.get(job);
            double srednia = suma / ilosc;
            System.out.printf("%-32s | %2d | %8.2f%n", job, ilosc, srednia);
        }
    }
}
