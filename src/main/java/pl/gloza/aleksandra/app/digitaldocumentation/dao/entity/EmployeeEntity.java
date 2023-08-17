package pl.gloza.aleksandra.app.digitaldocumentation.dao.entity;

import pl.gloza.aleksandra.app.digitaldocumentation.model.Address;
import pl.gloza.aleksandra.app.digitaldocumentation.model.Job;
import pl.gloza.aleksandra.app.digitaldocumentation.model.Note;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/*
CREATE TABLE EMPLOYEES(
        ID INT PRIMARY KEY,
        FIRST_NAME VARCHAR(255),
        LAST_NAME VARCHAR(255),
        BIRTHDAY DATE,
        NATIONALITY VARCHAR(255),
        PRICE FLOAT,
        ADDRESS_ID INT
);
 ALTER TABLE EMPLOYEES
    ADD FOREIGN KEY (ADDRESS_ID)
    REFERENCES ADDRESSES(ID);

    INSERT INTO EMPLOYEES VALUES(2, 'Ola', 'Nowak', '2023-08-10', 'Polish', 99, 2);
SELECT * FROM ADDRESSES;

SELECT *
FROM EMPLOYEES E
JOIN ADDRESSES A
ON E.ADDRESS_ID = A.ID;
*/
@Entity
@Table(name = "EMPLOYEES")
public class EmployeeEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private String nationality;
    private BigDecimal price;

    @OneToOne
    private AddressEntity address;

//    private List<Note> notes;

    public EmployeeEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public AddressEntity getAddress() {
        return address;
    }

    public void setAddress(AddressEntity address) {
        this.address = address;
    }

//    public List<Note> getNotes() {
//        return notes;
//    }
//
//    public void setNotes(List<Note> notes) {
//        this.notes = notes;
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                ", nationality='" + nationality + '\'' +
                ", price=" + price +
                ", address=" + address +
//                ", notes=" + notes +
                '}';
    }
}
