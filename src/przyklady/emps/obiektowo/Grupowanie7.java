package przyklady.emps.obiektowo;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import przyklady.emps.Employee;
import przyklady.emps.ObslugaCSV;

public class Grupowanie7 {

    public static void main(String[] args) {
    	final List<Employee> employees = ObslugaCSV.readFromFile("employees.csv");

    	final Map<String, JobInfo> mapa = new TreeMap<>();

        for (Employee emp : employees) {
            final String jobTitle = emp.getJobTitle();
			if(mapa.containsKey(jobTitle)) {
				JobInfo jobInfo = mapa.get(jobTitle);
				jobInfo.aktualizuj(emp);
            } else {
            	JobInfo jobInfo = JobInfo.dlaPierwszegoPracownika(emp);
            	mapa.put(jobTitle, jobInfo);
            }
        }

        for(JobInfo jobInfo : mapa.values()) {
            System.out.printf("%-32s | %2d | %8.2f%n",
            		jobInfo.getJob(), jobInfo.getIlosc(), jobInfo.getSrednia());
		}
    }
}
