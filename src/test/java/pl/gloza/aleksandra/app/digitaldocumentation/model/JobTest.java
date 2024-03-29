package pl.gloza.aleksandra.app.digitaldocumentation.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class JobTest {

    @Test
    void getPrice() {
        //given
        Job job = new Job("opieka nad dzieckiem", BigDecimal.TEN, null, null, null);

        //when
        BigDecimal price = job.getPrice();

        //then
        Assertions.assertNotNull(price, "not given price");

    }
}