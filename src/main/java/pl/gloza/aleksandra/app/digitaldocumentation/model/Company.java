package pl.gloza.aleksandra.app.digitaldocumentation.model;

import java.math.BigDecimal;
import java.util.List;

public class Company {
    private String name;
    private String phoneNumber;
    private BigDecimal salary;

    private Address address;
    private List<Job> jobs;
    private List<Employee> employees;

    public Job acceptJob(Employer employer) {
        BigDecimal employerPrice = employer.getPrice();
        for (Employee employee : employees) {
            BigDecimal employeePrice = employee.getPrice();
            int comparedPrice = employerPrice.compareTo(employeePrice);
            if (comparedPrice >= 0) {
                // TODO: 26.06.2023 konstruktor klasy Job powinien jako parametr przyjmować listę pracowników 
                return new Job("", employeePrice, employer, null);
            }
        }
        return null;
    }

    public void hire(Employee employee) {
        this.employees.add(employee);
    }


}
