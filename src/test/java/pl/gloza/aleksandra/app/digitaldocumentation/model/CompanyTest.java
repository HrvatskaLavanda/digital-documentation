package pl.gloza.aleksandra.app.digitaldocumentation.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

class CompanyTest {

    @Test
    void acceptJob() {
        // TODO: 26.06.2023 dla poniższego testu Company musi posiadać kilku pracowników,
        //  żeby przetestować metodę acceptJob()
        //given
        Employee olaEmployee = new Employee("Ola", "Kowalska", LocalDate.of(1950, 12, 20), "polish");
        olaEmployee.setPrice(BigDecimal.valueOf(100));
        Employee basiaEmployee = new Employee("Basia", "Nowak", LocalDate.of(1960, 05, 30), "italian");
        basiaEmployee.setPrice(BigDecimal.valueOf(120));

        Company company = new Company();
        company.hire(olaEmployee);
        company.hire(basiaEmployee);

        Employer employer = new Employer();
        employer.setPrice(BigDecimal.valueOf(100));

        Address jobAddress = new Address("Marszalkowska", "10", "Poland");

        //when
        Job job = company.acceptJob(employer, jobAddress);
        BigDecimal acceptedJobPrice = job.getPrice();
        Address acceptedJobAddress = job.getAddress();
        int jobEmployeesSize = job.getEmployees().size();
        // TODO: 29.06.2023  dodać asercje, która sprawdzić czy job ma przynajmniej jednego pracownika

        //then
        Assertions.assertAll(
                () -> Assertions.assertNotNull(job, "job not accepted"),
                () -> Assertions.assertNotNull(acceptedJobPrice, "no price given"),
                () -> Assertions.assertNotNull(acceptedJobAddress, "no address given"),
                () -> Assertions.assertTrue(jobEmployeesSize > 0, "no employee")
        );
    }
    // TODO: 29.06.2023 napić test dla metody hire() oraz addEmployee()
//    jeżeli metoda addEmployee() nie posiada implementacji, to ją dodać
    // test driven development (TDD)
    //dodać implementacje oraz testy dla metod z klasy Employer

    void hire() {
        //given
        Employee employee = new Employee("Ela", "Muller", LocalDate.of(1990, 04, 04), "polish");
        Company company = new Company();

        //when
        company.hire(employee);
        int companyEmployeeSize = company.getEmployees().size();

        //then
        Assertions.assertTrue(companyEmployeeSize > 0, "employee not hired");

    }

    void addEmployee() {
        //given
        Job job = new Job("opieka nad dzieckiem", BigDecimal.valueOf(100), null, null, null);
        Company company = new Company();
        //when
        company.addEmployee(job);

        //then
// TODO: 06.07.2023 napisz test do metody powyżej, poprawnie 
    }

    @Test
    void findEmployee() {
        // TODO: 06.07.2023 napisać test dla metody findEmployee() 
    }
    
    
}