package pl.gloza.aleksandra.app.digitaldocumentation.model;

import java.math.BigDecimal;
import java.util.List;

public class Employer {
    private String firstName;
    private String lastName;
    private String name;
    private BigDecimal price;

    private Address address;
    private List<Note> notes;

    public Job orderJob(Company company) {
        Job acceptedJob = company.acceptJob(this); //this - ta klasa/dana instancja obiektu
        return acceptedJob;
    }

    public boolean acceptPrice(Job job) {
        BigDecimal price = job.getPrice();
        return false;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", address=" + address +
                ", notes=" + notes +
                '}';
    }
}


