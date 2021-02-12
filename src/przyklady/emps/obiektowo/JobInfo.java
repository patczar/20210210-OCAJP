package przyklady.emps.obiektowo;

import przyklady.emps.Employee;

public class JobInfo {
	private final String job;
	private int ilosc;
	private double suma;
	
	private JobInfo(String job, int ilosc, double suma) {
		this.job = job;
		this.ilosc = ilosc;
		this.suma = suma;
	}
	
	public static JobInfo dlaPierwszegoPracownika(Employee emp) {
		return new JobInfo(emp.getJobTitle(), 1, emp.getSalary());
	}
	
	public void aktualizuj(Employee emp) {
		this.ilosc++;
		this.suma += emp.getSalary();
	}

	public String getJob() {
		return job;
	}

	public int getIlosc() {
		return ilosc;
	}

	public double getSuma() {
		return suma;
	}
	
	public double getSrednia() {
		return suma / ilosc;
	}
}
