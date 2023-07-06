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
        boolean isAccepted = employer.acceptPrice(job);
        //then
        Assertions.assertTrue(isAccepted, "is not accepted");
    }
}