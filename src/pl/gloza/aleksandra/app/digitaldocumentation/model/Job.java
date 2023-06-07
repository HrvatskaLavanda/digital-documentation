package pl.gloza.aleksandra.app.digitaldocumentation.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Job {
    private String name;
    private String description;
    private BigDecimal price;
    private LocalDateTime startDate;

    private Employer employer;
//    private Employee employee;
    private List<Employee> employees;
    private Address address;

    private List<Note> notes;

    public Job(String name, BigDecimal price, Employer employer, Address address) {
        this.name = name;
        this.price = price;
        this.startDate = LocalDateTime.now();
        this.employer = employer;
        this.address = address;
    }

    public BigDecimal getPrice() {
        return price;
    }
//    metoda pobiera dane z komputera o pracy
//    public void addJob() {
//
//    }
//
//    metoda szuka pracy w bazie danych prac po wybranych paramentach
//    public void searchJob() {
//
//    }
}
