package przyklady.emps.obiektowo;

import java.util.List;

import przyklady.emps.Employee;
import przyklady.emps.ObslugaCSV;

public class P4_MinMax_v2 {
    public static void main(String[] args) {
        List<Employee> employees = ObslugaCSV.readFromFile("employees.csv");
        Employee minEmployee = employees.get(0);
        Employee maxEmployee = employees.get(0);

        for (Employee emp : employees) {
            if(emp.getSalary() > maxEmployee.getSalary()) {
                maxEmployee = emp;
            }
            if(emp.getSalary() < minEmployee.getSalary()) {
                minEmployee = emp;
            }
        }

        System.out.println("Najbiedniejszy: " + minEmployee);
        System.out.println("Najbogatszy: " + maxEmployee);

    }
}
