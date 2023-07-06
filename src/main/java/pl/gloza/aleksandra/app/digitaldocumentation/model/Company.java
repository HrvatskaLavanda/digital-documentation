package pl.gloza.aleksandra.app.digitaldocumentation.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private String phoneNumber;
    private BigDecimal salary;

    private Address address;
    private List<Job> jobs = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();

    public Job acceptJob(Employer employer, Address jobAddress) {
        BigDecimal employerPrice = employer.getPrice();

        for (Employee employee : employees) {
            BigDecimal employeePrice = employee.getPrice();

            if (employerPrice != null && employeePrice != null) {
                int comparedPrice = employerPrice.compareTo(employeePrice);
                if (comparedPrice >= 0) {
                    return new Job("", employeePrice, employer, employee, jobAddress);
                }
            }
        }

        return null;
    }

    public void addEmployee(Job job) {
    }

    public void hire(Employee employee) {
        this.employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
