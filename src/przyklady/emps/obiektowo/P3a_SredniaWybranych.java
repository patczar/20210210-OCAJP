package przyklady.emps.obiektowo;

import javax.swing.*;

import przyklady.emps.Employee;
import przyklady.emps.ObslugaCSV;

import java.util.List;
import java.util.Objects;

public class P3a_SredniaWybranych {
    public static void main(String[] args) {
        String job = JOptionPane.showInputDialog("Podaj nazwę stanowiska:");

        List<Employee> employees = ObslugaCSV.readFromFile("employees.csv");

        double suma = 0;
        int ile = 0;
        for (Employee emp : employees) {
            if (Objects.equals(job, emp.getJobTitle())) {
                suma += emp.getSalary();
                ile++;
            }
        }

        if(ile == 0) {
            JOptionPane.showMessageDialog(null, "Nie ma takie stanowiska!", "Błąd", JOptionPane.ERROR_MESSAGE);
        } else {
            double srednia = suma / ile;
            JOptionPane.showMessageDialog(null, "Średnia: " + srednia);
        }
    }
}
