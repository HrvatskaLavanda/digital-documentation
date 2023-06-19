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

//    metoda pobiera dane z komputera o pracowniku
//    public void addDataEmployee() {}
//    te dane będą ustawione w konstruktorze, w tej sytuacji nie ma potrzeby tej metody

//    metoda pobiera dokument pdf z komputera
//    public void addCV() {}
//    tworzenie CV w oddzielnej klasie na podstawie danych pracownika

}
