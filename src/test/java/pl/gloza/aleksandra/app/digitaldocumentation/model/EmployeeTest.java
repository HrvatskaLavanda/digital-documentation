package pl.gloza.aleksandra.app.digitaldocumentation.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void acceptJob() {
        //given - tworzymy obiekt klasy testowanej oraz parametry metody testowanej
        Employee employee = new Employee("Jan", "Nowak", LocalDate.EPOCH, "polish");
        Job job = new Job("opieka nad dzieckiem", BigDecimal.TEN, null, null);

        //when - wywołanie metody testowanej dla klasy testowej
        boolean isAccepted = employee.acceptJob(job);

        //then - zapewniamy poprawność wartości zwracanej zgodnej ze wzorcem/z oczekiwaniem z metody testowej,
//        Assertions.assertEquals();
//        Assertions.assertEquals(true, isAccepted, "is not accepted");
        Assertions.assertTrue(isAccepted, "is not accepted");
    }
}
// TODO: 22.06.2023 napisać testy jednostkowe dla pozostałych modeli 