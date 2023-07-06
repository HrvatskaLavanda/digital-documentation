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

        Employee foundEmployee = findEmployee(employerPrice);
        if (foundEmployee != null) {
            return new Job("", foundEmployee.getPrice(), employer, foundEmployee, jobAddress);
        }
        return null;
    }

    public Employee addEmployee(Job job) {
        if (job != null) {
            Employer employer = job.getEmployer();
            if (employer != null) {
                BigDecimal employerPrice = employer.getPrice();
                Employee foundEmployee = findEmployee(employerPrice);
                if (foundEmployee != null) {
                    job.getEmployees().add(foundEmployee);
                    return foundEmployee;
                }
            }
        }
        return null;
    }

    public void hire(Employee employee) {
        this.employees.add(employee);
    }

    Employee findEmployee(BigDecimal employerPrice) {
        for (Employee employee : employees) {
            BigDecimal employeePrice = employee.getPrice();

            if (employerPrice != null && employeePrice != null) {
                int comparedPrice = employerPrice.compareTo(employeePrice);
                if (comparedPrice >= 0) {
                    return employee;
                }
            }
        }

        return null;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
