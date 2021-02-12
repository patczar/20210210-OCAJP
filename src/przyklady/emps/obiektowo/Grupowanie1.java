package przyklady.emps.obiektowo;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import przyklady.emps.Employee;
import przyklady.emps.ObslugaCSV;

public class Grupowanie1 {

    public static void main(String[] args) {
        List<Employee> employees = ObslugaCSV.readFromFile("employees.csv");

        // etap 1: zebrać unikalne nazwy stanowisk
        Set<String> jobs = new HashSet<>();
        for (Employee emp : employees) {
            jobs.add(emp.getJobTitle());
        }
        System.out.println("Liczba stanowisk: " + jobs.size());

        // etap 2: dla każdego stawiska przejrzyj listę pracowników i oblicz wyniki dla tego stanowiska
        for (String job : jobs) { // 19 razy
            double suma = 0;
            int ilosc = 0;
            for (Employee emp : employees) { // 107 razy
                if(Objects.equals(emp.getJobTitle(), job)) {
                    ilosc++;
                    suma += emp.getSalary();
                }
            }
            double srednia = suma / ilosc;
            System.out.printf("%-32s | %2d | %8.2f%n", job, ilosc, srednia);
        }
    }
}
