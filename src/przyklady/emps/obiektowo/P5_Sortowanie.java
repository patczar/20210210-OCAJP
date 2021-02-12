package przyklady.emps.obiektowo;

import java.util.Comparator;
import java.util.List;

import przyklady.emps.Employee;
import przyklady.emps.ObslugaCSV;

public class P5_Sortowanie {
    public static void main(String[] args) {
        List<Employee> employees = ObslugaCSV.readFromFile("employees.csv");
        employees.sort(Comparator.comparing(Employee::getSalary).reversed());

        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
