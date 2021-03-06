package przyklady.emps;

import java.time.LocalDate;
import java.util.Objects;

public class Employee_Comparable implements Comparable<Employee_Comparable> {
    private int id;
    private String firstName;
    private String lastName;
    private String jobTitle;
    private int salary;
    private LocalDate hireDate;
    private String departmentName;
    private String streetAddress;
    private String postalCode;
    private String city;
    private String country;

    public Employee_Comparable(int id, String firstName, String lastName, String jobTitle, int salary, LocalDate hireDate, String departmentName, String streetAddress, String postalCode, String city, String country) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hireDate = hireDate;
        this.departmentName = departmentName;
        this.streetAddress = streetAddress;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                ", departmentName='" + departmentName + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee_Comparable employee = (Employee_Comparable) o;
        return id == employee.id &&
                salary == employee.salary &&
                Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName) &&
                Objects.equals(jobTitle, employee.jobTitle) &&
                Objects.equals(hireDate, employee.hireDate) &&
                Objects.equals(departmentName, employee.departmentName) &&
                Objects.equals(streetAddress, employee.streetAddress) &&
                Objects.equals(postalCode, employee.postalCode) &&
                Objects.equals(city, employee.city) &&
                Objects.equals(country, employee.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, jobTitle, salary, hireDate, departmentName, streetAddress, postalCode, city, country);
    }

    @Override
    public int compareTo(Employee_Comparable other) {
        return Integer.compare(this.salary, other.salary);
    }
}
