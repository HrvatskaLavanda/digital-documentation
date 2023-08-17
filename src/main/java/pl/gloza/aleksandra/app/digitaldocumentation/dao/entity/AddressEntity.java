package pl.gloza.aleksandra.app.digitaldocumentation.dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "ADDRESSES")
public class AddressEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String street;
    @Column(name = "HOUSE_NUMBER")
    private String houseNumber;
    @Column(name = "ZIP_CODE")
    private String zipCode;
    private String country;

    public AddressEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "AddressEntity{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
