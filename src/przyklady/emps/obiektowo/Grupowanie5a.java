package przyklady.emps.obiektowo;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import przyklady.emps.Employee;
import przyklady.emps.ObslugaCSV;

public class Grupowanie5a {
    // W tej wersji użyjemy najbardziej zwięzłego: merge (Java 8)

    public static void main(String[] args) {
        List<Employee> employees = ObslugaCSV.readFromFile("employees.csv");

        Map<String, Integer> ilosci = new TreeMap<>();
        Map<String, Integer> sumy = new TreeMap<>();

        for (Employee emp : employees) {
            sumy.merge(emp.getJobTitle(), emp.getSalary(), Integer::sum);
            ilosci.merge(emp.getJobTitle(), 1, Integer::sum);
        }

        for (String job : ilosci.keySet()) {
            double suma = sumy.get(job);
            int ilosc = ilosci.get(job);
            double srednia = suma / ilosc;
            System.out.printf("%-32s | %2d | %8.2f%n", job, ilosc, srednia);
        }
    }
}
