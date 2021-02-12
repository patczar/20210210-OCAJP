package przyklady.emps.obiektowo;

import java.util.List;

import przyklady.emps.Employee;
import przyklady.emps.ObslugaCSV;

public class P3_SredniaProgrammerow {
    public static void main(String[] args) {
        List<Employee> employees = ObslugaCSV.readFromFile("employees.csv");

        double suma = 0;
        int ile = 0;
        for (Employee emp : employees) {
            if ("Programmer".equals(emp.getJobTitle())) {
                suma += emp.getSalary();
                ile++;
            }
        }

        double srednia = suma / ile;
        System.out.println("Średnia: " + srednia);
    }
}
