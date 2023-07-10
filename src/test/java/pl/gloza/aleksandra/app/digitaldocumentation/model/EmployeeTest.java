package pl.gloza.aleksandra.app.digitaldocumentation.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

class EmployeeTest {

    @Test
    void acceptJob() {
        //given - tworzymy obiekt klasy testowanej oraz parametry metody testowanej
        Employer employer = new Employer();
        Employee employee = new Employee("Jan", "Nowak", LocalDate.EPOCH, "polish");
        Job job = new Job("opieka nad dzieckiem", BigDecimal.TEN, employer, null, null);

        //when - wywołanie metody testowanej dla klasy testowej
//        boolean isAccepted = ;

        //then - zapewniamy poprawność wartości zwracanej zgodnej ze wzorcem/z oczekiwaniem z metody testowej,
//        Assertions.assertEquals();
//        Assertions.assertEquals(true, isAccepted, "is not accepted");
//        Assertions.assertTrue(isAccepted, "is not accepted");
        Assertions.assertThrows(UnsupportedOperationException.class,
                ()->employee.acceptJob(job) );
    }
}
// TODO: 22.06.2023 napisać testy jednostkowe dla pozostałych modeli 