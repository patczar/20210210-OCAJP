package przyklady.emps;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// Klasa narzędziowa / utility class
// Klasa, która zawiera metody statyczne. Nie tworzy się obiektów tej klasy.
public class ObslugaCSV {
	public static final String DEFAULT_FILE = "employees.csv";
    public static final String SEP = ";";

    private ObslugaCSV() {
        throw new IllegalStateException("This class is not intended to be instantiated");
    }

    public static List<Employee> readFromFile(String path) {
        return readFromFile(new File(path));
    }

    public static List<Employee> readFromFile(File file){
        List<Employee> employees = new ArrayList<>();

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] t = line.split(SEP, 11); // -1 albo dowolna liczba > 11 też by zadziałały
                Employee emp = new Employee(Integer.parseInt(t[0]), t[1], t[2], t[3], Integer.parseInt(t[4]),
                        LocalDate.parse(t[5]), t[6], t[7], t[8], t[9], t[10]);
                employees.add(emp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return employees;
    }

    public void writeToFile(List<Employee> list, String path) {
        writeToFile(list, new File(path));
    }

    public void writeToFile(List<Employee> list, File file) {
        try(PrintWriter out = new PrintWriter(file)) {
            for (Employee emp : list) {
                out.print(emp.getId());
                out.print(SEP);
                out.print(emp.getFirstName());
                out.print(SEP);
                out.print(emp.getLastName());
                out.print(SEP);
                out.print(emp.getJobTitle());
                out.print(SEP);
                out.print(emp.getSalary());
                out.print(SEP);
                out.print(emp.getHireDate());
                out.print(SEP);
                out.print(emp.getDepartmentName());
                out.print(SEP);
                out.print(emp.getStreetAddress());
                out.print(SEP);
                out.print(emp.getPostalCode());
                out.print(SEP);
                out.print(emp.getCity());
                out.print(SEP);
                out.print(emp.getCountry());
                out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
