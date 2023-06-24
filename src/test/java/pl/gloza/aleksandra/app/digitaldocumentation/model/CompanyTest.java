package pl.gloza.aleksandra.app.digitaldocumentation.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {

    @Test
    void acceptJob() {
        //given
        Company company = new Company();
        Employer employer = new Employer();
        //when
        Job jobName = company.acceptJob(employer);

        //then
        Assertions.assertNotNull(jobName, "not chosen job");

    }
}