package przyklady.emps.obiektowo;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import przyklady.emps.Employee;
import przyklady.emps.ObslugaCSV;

public class Grupowanie3 {
    // W tej wersji zamiast pisać if-y użyjemy getOrDefault (Java 8)

    public static void main(String[] args) {
        List<Employee> employees = ObslugaCSV.readFromFile("employees.csv");

        Map<String, Integer> ilosci = new TreeMap<>();
        Map<String, Integer> sumy = new TreeMap<>();

        for (Employee emp : employees) {
            String jobTitle = emp.getJobTitle();
			int dotychczasowaIlosc = ilosci.getOrDefault(jobTitle, 0);
            int dotychczasowaSuma = sumy.getOrDefault(jobTitle, 0);
            ilosci.put(jobTitle, dotychczasowaIlosc + 1);
            sumy.put(jobTitle, dotychczasowaSuma + emp.getSalary());
        }

        for (String job : ilosci.keySet()) {
            double suma = sumy.get(job);
            int ilosc = ilosci.get(job);
            double srednia = suma / ilosc;
            System.out.printf("%-32s | %2d | %8.2f%n", job, ilosc, srednia);
        }
    }
}
