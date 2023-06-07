package pl.gloza.aleksandra.app.digitaldocumentation.model;

public class Address {
    private String street;
    private String houseNumber;
    private String zipCode;
    private String country;

    public Address(String street, String houseNumber, String country) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.country = country;
    }

    public Address(String street, String houseNumber, String zipCode, String country) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.zipCode = zipCode;
        this.country = country;
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
        return "Address{" +
                "street='" + street + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

//    typowo anemiczna klasa, POJO, więc lepiej nie dodawać metody
//
//    metoda pobiera dane z komputera o adresie
//    public void addAddress() {
//
//    }
}
