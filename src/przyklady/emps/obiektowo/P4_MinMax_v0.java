package przyklady.emps.obiektowo;

import java.util.List;

import przyklady.emps.Employee;
import przyklady.emps.ObslugaCSV;

public class P4_MinMax_v0 {
    public static void main(String[] args) {
        List<Employee> employees = ObslugaCSV.readFromFile("employees.csv");
        int minSalary = Integer.MAX_VALUE;
        int maxSalary = Integer.MIN_VALUE;

        Employee min = null, max = null;

        for (Employee emp : employees) {
            if(emp.getSalary() > maxSalary) {
                maxSalary = emp.getSalary();
                max = emp;
            }
            if(emp.getSalary() < minSalary) {
                minSalary = emp.getSalary();
                min = emp;
            }
        }

        System.out.println(min);
        System.out.println(max);

    }
}
