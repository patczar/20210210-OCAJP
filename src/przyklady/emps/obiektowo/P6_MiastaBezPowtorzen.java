package przyklady.emps.obiektowo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import przyklady.emps.Employee;
import przyklady.emps.ObslugaCSV;

public class P6_MiastaBezPowtorzen {
    public static void main(String[] args) {
        List<Employee> employees = ObslugaCSV.readFromFile("employees.csv");

        Set<String> miasta = new TreeSet<>();
        for (Employee emp : employees) {
            miasta.add(emp.getCity());
        }

        for (String miasto : miasta) {
            System.out.println(" * " + miasto);
        }
    }
}
