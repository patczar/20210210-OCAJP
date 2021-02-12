package przyklady.emps.obiektowo;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import przyklady.emps.Employee;
import przyklady.emps.ObslugaCSV;

public class Grupowanie5 {
    // W tej wersji użyjemy najbardziej zwięzłego: merge (Java 8)

    public static void main(String[] args) {
        List<Employee> employees = ObslugaCSV.readFromFile("employees.csv");

        Map<String, Integer> ilosci = new TreeMap<>();
        Map<String, Integer> sumy = new TreeMap<>();

        for (Employee emp : employees) {
            String jobTitle = emp.getJobTitle();
            
            // merge:
            // 1) jeśli danego klucza jeszcze nie ma, wstawia podaną wartość, tutaj salary
            // 2) jeśli taki klucz już jest, to podana funkcja jest wywoływana dla argumentów:
            //    ("stara wartość ze słownika", "wartość podana tutaj", czyli salary 
            //    wynik tej funkcji jest wstawiany do mapy jako nowa wartość
            sumy.merge(jobTitle, emp.getSalary(), (staraWartosc, zmiana) -> staraWartosc+zmiana);
            ilosci.merge(jobTitle, 1, (x, y) -> x+y);
        }

        for (String job : ilosci.keySet()) {
            double suma = sumy.get(job);
            int ilosc = ilosci.get(job);
            double srednia = suma / ilosc;
            System.out.printf("%-32s | %2d | %8.2f%n", job, ilosc, srednia);
        }
    }
}
