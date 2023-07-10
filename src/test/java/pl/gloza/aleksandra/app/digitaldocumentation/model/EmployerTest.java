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
    }
    // TODO: 10.07.2023 napisać test jednostkowy
}