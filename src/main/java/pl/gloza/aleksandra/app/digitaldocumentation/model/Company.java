package pl.gloza.aleksandra.app.digitaldocumentation.model;

import java.math.BigDecimal;
import java.util.List;

public class Company {
    private String name;
    private String phoneNumber;
    private BigDecimal salary;

    private Address address;
    private List<Job> jobs;

    public Job acceptJob(Employer employer) {
        return null;
    }


}
