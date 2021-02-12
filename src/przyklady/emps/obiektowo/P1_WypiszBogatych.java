package przyklady.emps.obiektowo;

import java.util.List;

import przyklady.emps.Employee;
import przyklady.emps.ObslugaCSV;

public class P1_WypiszBogatych {
    public static void main(String[] args) {
        List<Employee> employees = ObslugaCSV.readFromFile("employees.csv");

        for (Employee emp : employees) {
            if (emp.getSalary() >= 10_000) {
                System.out.println(emp);
            }
        }

    }
}
