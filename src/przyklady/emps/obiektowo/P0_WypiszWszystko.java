package przyklady.emps.obiektowo;

import java.util.List;

import przyklady.emps.Employee;
import przyklady.emps.ObslugaCSV;

public class P0_WypiszWszystko {
    public static void main(String[] args) {
        List<Employee> employees = ObslugaCSV.readFromFile("employees.csv");

        System.out.println("Wczytano " + employees.size() + " rekordów:");
        for (Employee emp : employees) {
            System.out.println(emp);
            // dostęp do wybranego pola: System.out.println(emp.getFirstName());
        }

    }
}
