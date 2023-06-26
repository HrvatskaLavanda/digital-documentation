package pl.gloza.aleksandra.app.digitaldocumentation.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Employee {
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private String nationality;
    private BigDecimal price;

    private Address address;
    private List<Note> notes;

    public Employee(String firstName, String lastName,
                    LocalDate birthday, String nationality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.nationality = nationality;
    }

    public boolean acceptJob(Job job) {
        return false;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                ", nationality='" + nationality + '\'' +
                ", price=" + price +
                ", address=" + address +
                ", notes=" + notes +
                '}';
    }
}
