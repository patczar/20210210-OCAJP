package przyklady.emps.obiektowo;

import java.util.List;

import przyklady.emps.Employee;
import przyklady.emps.ObslugaCSV;

public class P4_MinMax_v1 {
    public static void main(String[] args) {
        List<Employee> employees = ObslugaCSV.readFromFile("employees.csv");
        Employee minEmployee = null;
        Employee maxEmployee = null;

        for (Employee emp : employees) {
            if(maxEmployee == null || emp.getSalary() > maxEmployee.getSalary()) {
                maxEmployee = emp;
            }
            if(minEmployee == null || emp.getSalary() < minEmployee.getSalary()) {
                minEmployee = emp;
            }
        }

        System.out.println("Najbiedniejszy: " + minEmployee);
        System.out.println("Najbogatszy: " + maxEmployee);

    }
}
