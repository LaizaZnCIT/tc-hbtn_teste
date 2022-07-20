import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

class PersonTest {

    Person person;
    @BeforeEach
    void setUp() {
        person = new Person();
        person.setName("Paul");
        person.setSurname("McCartney");
        person.setBirthDate(new Date(2000));
        person.setPublicServer(true);
        person.setPensioner(true);
        person.setAnotherCompanyOwner(true);
    }

    @Test
    public void show_full_name(){
        Assertions.assertEquals("Paul McCartney", person.fullName());
    }

    @Test
    public void test_calculateYearlySalary(){
        person.setSalary(1200);
        Assertions.assertEquals(14400, person.calculateYearlySalary());
    }

    @Test
    public void person_is_MEI(){
        person.setPublicServer(false);
        person.setPensioner(false);
        person.setAnotherCompanyOwner(false);
        person.setSalary(1000);
        Assertions.assertTrue(person.isMEI());
    }

    @Test
    public void person_is_not_MEI(){
        Assertions.assertFalse(person.isMEI());
    }

}