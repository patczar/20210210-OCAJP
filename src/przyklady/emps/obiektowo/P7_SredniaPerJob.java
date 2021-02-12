package przyklady.emps.obiektowo;

import java.util.*;

import przyklady.emps.Employee;
import przyklady.emps.ObslugaCSV;

public class P7_SredniaPerJob {
    public static void main(String[] args) {
        List<Employee> employees = ObslugaCSV.readFromFile("employees.csv");

        Map<String, Integer> sumy = new HashMap<>();
        Map<String, Integer> ilosci = new HashMap<>();

        for (Employee emp : employees) {
            if (sumy.containsKey(emp.getJobTitle())) {
                int poprzedniaSuma = sumy.get(emp.getJobTitle());
                sumy.put(emp.getJobTitle(), poprzedniaSuma + emp.getSalary());
                int poprzedniaIlosc = ilosci.get(emp.getJobTitle());
                ilosci.put(emp.getJobTitle(), poprzedniaIlosc + 1);
            } else {
                sumy.put(emp.getJobTitle(), emp.getSalary());
                ilosci.put(emp.getJobTitle(), 1);
            }
        }

        System.out.println("Jest " + sumy.size() + " różnych stanowisk.");

        for (String job : sumy.keySet()) {
            int ilosc = ilosci.get(job);
            int suma = sumy.get(job);
            double srednia = 1.0 * suma / ilosc;
            System.out.println(job + ": ilość " + ilosc + ", średnia: " + srednia);
        }
    }
}
