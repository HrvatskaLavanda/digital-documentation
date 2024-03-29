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

    public Job orderJob(Company company, Address jobAddress) {
        throw new UnsupportedOperationException("we don't know yet");
    }

    public boolean acceptPrice(Job job) {
        throw new UnsupportedOperationException("we don't know yet");
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
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


