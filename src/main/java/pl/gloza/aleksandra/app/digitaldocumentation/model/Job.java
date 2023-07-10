package pl.gloza.aleksandra.app.digitaldocumentation.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Job {
    private String name;
    private String description;
    private BigDecimal price;
    private LocalDateTime startDate;

    private Employer employer;
    private List<Employee> employees = new ArrayList<>();
    private Address address;

    private List<Note> notes;

    public Job(String name, BigDecimal price, Employer employer, Employee employee, Address address) {
        this.name = name;
        this.price = price;
        this.startDate = LocalDateTime.now();
        this.employer = employer;
        this.employees.add(employee);
        this.address = address;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Employer getEmployer() {
        return employer;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public Address getAddress() {
        return address;
    }
}
