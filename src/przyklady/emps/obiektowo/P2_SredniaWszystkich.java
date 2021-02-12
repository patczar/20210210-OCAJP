package przyklady.emps.obiektowo;

import java.util.List;

import przyklady.emps.Employee;
import przyklady.emps.ObslugaCSV;

public class P2_SredniaWszystkich {
    public static void main(String[] args) {
        List<Employee> employees = ObslugaCSV.readFromFile("employees.csv");

        int suma = 0;
        for (Employee emp : employees) {
            suma += emp.getSalary();
        }
        System.out.println("Suma: " + suma);

        // int / int to "dzielenie całkowite", wynik nie zawiera części ułamkowej.
        double srednia = (double)suma / employees.size();
        System.out.println("Średnia: " + srednia);
    }
}
