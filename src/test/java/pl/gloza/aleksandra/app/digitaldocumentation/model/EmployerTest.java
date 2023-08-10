package pl.gloza.aleksandra.app.digitaldocumentation.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class EmployerTest {

    @Test
    void acceptPrice() {
        //given
        Employer employer = new Employer();
        Job job = new Job("opieka nad dzieckiem", BigDecimal.TEN, employer, null, null);
        //when

        //then
        Assertions.assertThrows(UnsupportedOperationException.class,
                () -> employer.acceptPrice(job));
    }

    @Test
    void orderJob() {
        //given - tworzymy obiekt klasy testowanej oraz parametry metody testowanej
        Employer employer = new Employer();
        Company company = new Company();
        Address jobAddress = new Address("Marszalkowska", "100", "Poland");
        //when - wywołanie metody testowanej dla klasy testowej

        //then - zapewniamy poprawność wartości zwracanej zgodnej ze wzorcem/z oczekiwaniem z metody testowej
        Assertions.assertThrows(UnsupportedOperationException.class,
                () -> employer.orderJob(company, jobAddress));
    }
    // TODO: 10.07.2023 napisać test jednostkowy
}