package pl.gloza.aleksandra.app.digitaldocumentation.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {

    @Test
    void acceptJob() {
        // TODO: 26.06.2023 dla poniższego testu Company musi posiadać kilku pracowników,
        //  żeby przetestować metodę acceptJob()
        //given
        Company company = new Company();
        Employer employer = new Employer();
        //when
        Job jobName = company.acceptJob(employer);

        //then
        Assertions.assertNotNull(jobName, "not chosen job");

    }
}